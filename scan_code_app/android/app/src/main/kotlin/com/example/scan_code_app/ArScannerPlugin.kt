package com.example.scan_code_app

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.util.Log
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.isprint.arcode2sdk.ARScannerActivity
import io.flutter.embedding.engine.plugins.activity.ActivityAware
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
import io.flutter.embedding.engine.plugins.FlutterPlugin
import io.flutter.plugin.common.MethodCall
import io.flutter.plugin.common.MethodChannel
import io.flutter.plugin.common.MethodChannel.MethodCallHandler
import io.flutter.plugin.common.MethodChannel.Result
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ArScannerPlugin : FlutterPlugin, MethodCallHandler, ActivityAware {

    private lateinit var channel: MethodChannel
    private var activity: Activity? = null
    private var result: Result? = null
    private val SCAN_REQUEST_CODE = 1000
    private var binding: ActivityPluginBinding? = null

    override fun onAttachedToEngine(binding: FlutterPlugin.FlutterPluginBinding) {
        channel = MethodChannel(binding.binaryMessenger, "ar_scanner_plugin")
        channel.setMethodCallHandler(this)
    }

    override fun onDetachedFromEngine(binding: FlutterPlugin.FlutterPluginBinding) {
        channel.setMethodCallHandler(null)
    }

    override fun onAttachedToActivity(binding: ActivityPluginBinding) {
        activity = binding.activity
        this.binding = binding
        binding.addActivityResultListener { requestCode, resultCode, data ->
            if (requestCode == SCAN_REQUEST_CODE) {
                when (resultCode) {
                    Activity.RESULT_OK -> {
                        handleScanResult(data)
                    }
                    Activity.RESULT_CANCELED -> {
                        result?.error("SCAN_CANCELLED", "Scan was cancelled by user", null)
                    }
                    else -> {
                        result?.error("SCAN_ERROR", "Unknown error occurred during scanning", null)
                    }
                }
            }
            true // Trả về true để Flutter biết kết quả đã được xử lý
        }
    }

    override fun onDetachedFromActivity() {
        binding = null
        activity = null
    }

    override fun onReattachedToActivityForConfigChanges(binding: ActivityPluginBinding) {
        this.binding = binding
        activity = binding.activity
        binding.addActivityResultListener { requestCode, resultCode, data ->
            if (requestCode == SCAN_REQUEST_CODE) {
                when (resultCode) {
                    Activity.RESULT_OK -> {
                        handleScanResult(data)
                    }
                    Activity.RESULT_CANCELED -> {
                        result?.error("SCAN_CANCELLED", "Scan was cancelled by user", null)
                    }
                    else -> {
                        result?.error("SCAN_ERROR", "Unknown error occurred during scanning", null)
                    }
                }
            }
            true
        }
    }

    override fun onDetachedFromActivityForConfigChanges() {
        activity = null
    }

    override fun onMethodCall(call: MethodCall, result: Result) {
        this.result = result
        when (call.method) {
            "startScan" -> {
                startScan()
            }
            else -> {
                result.notImplemented()
            }
        }
    }

    private fun handleScanResult(data: Intent?) {
        try {
            val qrtext = data?.getStringExtra("qrtext")
            val arresult = data?.getIntExtra("arresult", 0) ?: 0
            val serverData = data?.getStringExtra("serverData")
            val extendedData = data?.getStringExtra("extendedData")
            val code = data?.getStringExtra("code")
            val errorCode = data?.getIntExtra("errorCode", 0)?.toString()
            val message = data?.getStringExtra("message")

            // Log kết quả
            Log.d("resultData", """
                qrtext:$qrtext,
                arresult:$arresult,
                serverData:$serverData,
                extendedData:$extendedData,
                code:$code,
                message:$message
            """.trimIndent())

            // Xử lý extended data nếu có
            val resultMap = HashMap<String, Any?>()
            extendedData?.let { extData ->
                try {
                    val jsonObject = JSONObject(extData)
                    val hasExternalText = jsonObject.has("externalText") && !jsonObject.isNull("externalText")
                    val hasText = jsonObject.has("text") && !jsonObject.isNull("text")

                    if (hasExternalText && hasText) {
                        val text = jsonObject.getString("text")
                        val externalText = jsonObject.getString("externalText")
                        resultMap["text"] = text
                        resultMap["externalText"] = externalText
                    }
                } catch (e: Exception) {
                    Log.e("ArScannerPlugin", "Error parsing extendedData", e)
                    resultMap["error"] = e.message
                }
            }

            // Thêm tất cả các kết quả vào map
            resultMap.apply {
                put("qrtext", qrtext)
                put("arresult", arresult)
                put("serverData", serverData)
                put("extendedData", extendedData)
                put("code", code)
                put("errorCode", errorCode)
                put("message", message)
            }

            // Trả kết quả về Flutter
            result?.success(resultMap)

        } catch (e: Exception) {
            Log.e("ArScannerPlugin", "Error processing scan result", e)
            result?.error("SCAN_PROCESSING_ERROR", e.message, null)
        }
    }

    private fun startScan() {
        if (ContextCompat.checkSelfPermission(activity!!, android.Manifest.permission.CAMERA)
            != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(activity!!,
                arrayOf(android.Manifest.permission.CAMERA),
                SCAN_REQUEST_CODE)
            return
        }

        val sendGetTokenBean = SendGetTokenBean().apply {
            setAppId("33776580468942649aa3f0cb6f42a912")
            setApiKey("SecretKey_6178f2f6fc0c4b7d81c13aad41290981")
        }
        startScanWithToken("eyJ0eXBlIjoiYWNjZXNzIiwiYWxnIjoiSFM1MTIifQ.eyJleHAiOjE3MzIzNTExMTAsImp0aSI6Ijk4N2U2ZjNkZmI1NTQ1NzA5MDIyN2UwOGFkMmMxMDEzIn0.H-Ebhzhu3uP9KaUw-nS2bJPqPx4Safssf8m2JCUuENqg3x6oNPooyOVVKNvjgwpNIXL5ry4tGgh6bumHlDyTaw")
    }

    private fun startScanWithToken(authorization: String) {
        val api = "https://ar2.accessreal.com:443/api/v1/app/arbtp/uaid/tdata"
        ARScannerActivity.setAccessRealRestURL(api)

        val restHeaders = hashMapOf(
            "Authorization" to authorization,
            "locale" to "en_US"
        )
        ARScannerActivity.setAccessRealRestHeaders(restHeaders)

        ARScannerActivity.setFlashEnabled(true)
        ARScannerActivity.setFlashControlEnabled(true)
        ARScannerActivity.setScanMode(2)
        ARScannerActivity.setDetectionTimeoutInSecs(15)

        val intent = Intent(activity, ARScannerActivity::class.java)
        activity?.startActivityForResult(intent, SCAN_REQUEST_CODE)
    }
}
