package com.lenovo.weatherforecast.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by 高繁 on 2017/10/16.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
