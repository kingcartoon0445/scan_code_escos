package com.example.scan_code_app.activity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.alibaba.fastjson.JSON;
import com.example.scan_code_app.R;
import com.example.scan_code_app.app.PreferenceHelper;
import com.example.scan_code_app.bean.GetTokenBean;
import com.example.scan_code_app.bean.SendGetTokenBean;
import com.example.scan_code_app.util.BaseCallBack;
import com.example.scan_code_app.util.GsonUtils;
import com.example.scan_code_app.util.HttpUtils;
import com.isprint.arcode2sdk.ARScannerActivity;

import java.util.HashMap;
import java.util.Map;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private static final int Scan_Result_Data = 1000, PERMISSION_REQUEST_CODE = 2000;
    PreferenceHelper preferenceHelper;
    TextView resultDa, requestDa, textView_extendedData;
    private String Authorization;
    //    private String URL = "https://ar2demo.accessreal.com:443/";
    private String URL = "https://ar2.accessreal.com:443/";



    private void GetOpenAPIToken() {
        SendGetTokenBean sendGetTokenBean = new SendGetTokenBean();
        sendGetTokenBean.setAppId("33776580468942649aa3f0cb6f42a912");
        sendGetTokenBean.setApiKey("SecretKey_6178f2f6fc0c4b7d81c13aad41290981");
        String json = GsonUtils.GsonString(sendGetTokenBean);
        RequestBody body = RequestBody.create(MediaType.parse("application/json"), json);
        HttpUtils.getApi().GetToken(body).enqueue(new BaseCallBack<>(MainActivity.this) {
            @Override
            public void onSuccess(Call<GetTokenBean> call, Response<GetTokenBean> response) {
                GetTokenBean bean = response.body();
                if (bean.getCode().equals("0")) {
                    Authorization = bean.getData().getTokenType() + " " + bean.getData().getSessionToken();
                    preferenceHelper.setDataSave("Authorization", Authorization);
                    StartScan(Authorization);
                } else {
                    Toast.makeText(getApplicationContext(), bean.getMessage() + "", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onError(Call<GetTokenBean> call, Throwable t) {
            }
        });
    }

    private void StartScan(String Authorization) {
        if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{android.Manifest.permission.CAMERA}, PERMISSION_REQUEST_CODE);
            return;
        }
        String api = URL + "api/v1/app/arbtp/uaid/tdata";
        ARScannerActivity.setAccessRealRestURL(api);
        Map<String, String> restHeaders = new HashMap<>();
        restHeaders.put("Authorization", Authorization);
        restHeaders.put("locale", "en_US");
        ARScannerActivity.setAccessRealRestHeaders(restHeaders);
        String appCode = "Android_customer";
        Map<String, Object> restParams = new HashMap<>();
        restParams.put("appCode", appCode);
        ARScannerActivity.setAccessRealRestParams(restParams);
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("skipActive", true);
        ARScannerActivity.setTest(params);
        ARScannerActivity.setFlashEnabled(true);
        ARScannerActivity.setFlashControlEnabled(true);
        ARScannerActivity.setScanMode(2);
        /*Set Timeout*/
        ARScannerActivity.setDetectionTimeoutInSecs(15);
        ARScannerActivity.setConnectionTimeoutInSecs(10);
        ARScannerActivity.setAuthenticationTimeoutInSecs(15);

        Intent intent = new Intent(this, ARScannerActivity.class);
        startActivityForResult(intent, Scan_Result_Data);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case Scan_Result_Data:
                if (resultCode == RESULT_OK) {
                    String qrtext = data.getStringExtra("qrtext");
                    int arresult = data.getIntExtra("arresult", 0);
                    String serverData = data.getStringExtra("serverData");
                    String extendedData = data.getStringExtra("extendedData");
                    String code = data.getStringExtra("code");
                    String errorCode = data.getIntExtra("errorCode", 0) + "";
                    String message = data.getStringExtra("message");
                    Log.d("resultData", "qrtext:" + qrtext + ",arresult:" + arresult + ",serverData:" + serverData + ",extendedData:" + extendedData + ",code:" + code + ",message:" + message);
                    Log.d("extendedDataLog", "extendedData:" + extendedData);
//                    //This section requires GPS acquisition and the input of latitude and longitude coordinates.
//                    SirimSDK.SirimAuthenticate(MainActivity.this, data, URL, "test", latitude, longitude, Authorization, "en_US", resultBean -> {
//
//                    });
//

//                    int arresult = data.getIntExtra("arresult", 0);
                    try {
                        boolean containsExternalText = JSON.parseObject(data.getStringExtra("extendedData")).containsKey("externalText") && JSON.parseObject(data.getStringExtra("extendedData")).get("externalText") != null;
                        boolean containsText = JSON.parseObject(data.getStringExtra("extendedData")).containsKey("text") && JSON.parseObject(data.getStringExtra("extendedData")).get("text") != null;
                        if (containsExternalText && containsText) {
                            resultDa.setText("Text:      " + JSON.parseObject(data.getStringExtra("extendedData")).get("text") + "   externalText:    " + JSON.parseObject(data.getStringExtra("extendedData")).get("externalText"));
                            requestDa.setText("Result:      " + arresult);
                        }
                        textView_extendedData.setText("ExtendedData:     " + data.getStringExtra("extendedData"));
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
                break;

        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == PERMISSION_REQUEST_CODE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                StartScan(Authorization);
            }
        }
    }


}

