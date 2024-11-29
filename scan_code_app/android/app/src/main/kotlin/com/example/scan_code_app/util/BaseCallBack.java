package com.example.scan_code_app.util;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.example.myapplication.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Rehome-rjb1 on 2017/5/17.
 * 请求数据的封装，封装了一个dialog
 */

public abstract class BaseCallBack<T> implements Callback<T> {

    private final Context context;

//    private final LoadDialog dialog;

    public BaseCallBack(Context context) {
        this.context = context;
//        dialog = new LoadDialog(context, false, context.getString( R.string.loading));
//        dialog.show();
    }

    @Override
    public void onResponse(Call<T> call, Response<T> response) {
//        dialog.dismiss();
        onSuccess(call, response);

    }

    @Override
    public void onFailure(Call<T> call, Throwable t) {
//        dialog.dismiss();
        Toast.makeText(context, t.getMessage(), Toast.LENGTH_SHORT).show();
        Log.d("okhttpmsg",t.getMessage());
        onError(call, t);
    }

    public abstract void onSuccess(Call<T> call, Response<T> response);

    public abstract void onError(Call<T> call, Throwable t);
}
