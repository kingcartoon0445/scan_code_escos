package com.example.scan_code_app.util;

import android.content.Context;
import android.util.Log;


import com.example.scan_code_app.app.APP;
import com.example.scan_code_app.app.PreferenceHelper;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class HttpUtils {
    private static Api api;
    private static Context context;
    private static HttpUtils instance = null;

    public static String HTTPS = "https://";
    private static PreferenceHelper preferenceHelper = PreferenceHelper.getInstance(APP.mContext);

    public static HttpUtils getInstance(Context context, String url) {
        if (instance == null) {
            instance = new HttpUtils(context, url);
        }
        return instance;
    }

    private HttpUtils(Context context, String url) {
        Retrofit mRetrofit = new Retrofit.Builder()
                .baseUrl(url)
                .client(getOkHttpClient())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        api = mRetrofit.create(Api.class);
        HttpUtils.context = context;
    }


    public static Api getApi() {
        return getApi("https://ar2.accessreal.com:443/");

    }

    public static Api getApi(String url) {
        Retrofit mRetrofit = new Retrofit.Builder()
                .baseUrl(url)
                .client(getOkHttpClient())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Api api = mRetrofit.create(Api.class);
        return api;
    }

    private static OkHttpClient getOkHttpClient() {
        OkHttpClient.Builder httpClientBuilder = new OkHttpClient.Builder();
        httpClientBuilder.addInterceptor(new LoggingInterceptor());
        httpClientBuilder.connectTimeout(60, TimeUnit.SECONDS);
        httpClientBuilder.writeTimeout(60, TimeUnit.SECONDS);
        httpClientBuilder.readTimeout(60, TimeUnit.SECONDS);
        return httpClientBuilder.build();
    }

    public static class LoggingInterceptor implements Interceptor {
        @Override
        public Response intercept(Chain chain) throws IOException {
            String Authorization = preferenceHelper.getSavedData("Authorization", "");
            Request request = chain.request().newBuilder()
                    .addHeader("Authorization", Authorization)
                    .addHeader("locales", "en_US").build();
            long t1 = System.nanoTime();//请求发起的时间
            Log.d("okhttpmsg", String.format("发送请求 %s on %s%n%s", request.url(), chain.connection(), request.headers()));
            Response response = chain.proceed(request);
            long t2 = System.nanoTime();//收到响应的时间
            ResponseBody responseBody = response.peekBody(1024 * 1024);
            Log.d("okhttpmsg", String.format("接收响应: [%s] %n返回json:【%s】 %.1fms%n%s", response.request().url(), responseBody.string(), (t2 - t1) / 1e6d, response.headers()));
            return response;
        }
    }
}
