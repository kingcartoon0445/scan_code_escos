package com.example.scan_code_app.app;

import android.app.Application;
import android.content.Context;



public class APP extends Application {
    public static Context mContext;
    @Override
    public void onCreate() {
        super.onCreate();
        this.mContext = this;
    }
}
