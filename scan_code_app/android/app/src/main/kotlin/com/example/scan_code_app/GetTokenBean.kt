package com.example.scan_code_app

data class GetTokenBean(
    val code: String = "",
    val message: String = "",
    val data: TokenData = TokenData()
)

data class TokenData(
    val sessionToken: String = "33776580468942649aa3f0cb6f42a912",
    val tokenType: String = "SecretKey_6178f2f6fc0c4b7d81c13aad41290981"
)