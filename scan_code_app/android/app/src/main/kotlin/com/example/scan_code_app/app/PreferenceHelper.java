package com.example.scan_code_app.app;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * @ClassName: PreferenceHelper
 * @Description: TODO(simple description this class what to do.)
 * @author huaxingl
 * @version 1.2
 */
public class PreferenceHelper {
    private static PreferenceHelper preferenceHelper = null;

    private String mSharedName = "CUSTOMER_SDK_V1.0.0";

    private static Context context;

    SharedPreferences settings;

    SharedPreferences.Editor editor;

    private PreferenceHelper() {
        settings = context.getSharedPreferences(mSharedName, context.MODE_PRIVATE);
        editor = settings.edit();
    }

    public static PreferenceHelper getInstance(Context con) {
        context = con;
        if (preferenceHelper == null) {
            preferenceHelper = new PreferenceHelper();
        }
        return preferenceHelper;
    }

    public void setDataSave(String key, String value) {
        editor.putString(key, value);
        editor.commit();
    }

    public String getSavedData(String key, String defaultValue) {
        return settings.getString(key, defaultValue);
    }

    public void setDataSave(String key, boolean value) {
        editor.putBoolean(key, value);
        editor.commit();
    }

    public boolean getSavedData(String key, boolean defaultValue) {
        return settings.getBoolean(key, defaultValue);
    }

    public void setDataSave(String key, Float value) {
        editor.putFloat(key, value);
        editor.commit();
    }

    public float getSavedData(String key, Float defaultValue) {
        return settings.getFloat(key, defaultValue);
    }

    public void setDataSave(String key, int value) {
        editor.putInt(key, value);
        editor.commit();
    }

    public int getSavedData(String key, int defaultValue) {
        return settings.getInt(key, defaultValue);
    }

    public void setDataSave(String key, long value) {
        editor.putLong(key, value);
        editor.commit();
    }

    public long getSavedData(String key, long defaultValue) {
        return settings.getLong(key, defaultValue);
    }

    public void clearData() {
        editor.clear();
        editor.commit();
    }
}
