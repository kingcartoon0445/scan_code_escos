package com.example.scan_code_app.util;


import com.example.scan_code_app.bean.GetTokenBean;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface Api {
    /*Get Session Token*/
    @POST("/api/v1/app/auth/token/get")
    Call<GetTokenBean> GetToken(@Body RequestBody json);


}
