package com.example.scan_code_app

data class SendGetTokenBean(
    private var appId: String = "33776580468942649aa3f0cb6f42a912",
    private var apiKey: String = "SecretKey_6178f2f6fc0c4b7d81c13aad41290981"
) {
    fun setAppId(appId: String) {
        this.appId = appId
    }

    fun setApiKey(apiKey: String) {
        this.apiKey = apiKey
    }
}