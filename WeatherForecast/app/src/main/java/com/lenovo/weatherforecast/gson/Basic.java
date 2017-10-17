package com.lenovo.weatherforecast.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 高繁 on 2017/10/17.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weathId;
    public Update update;
    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }

}
