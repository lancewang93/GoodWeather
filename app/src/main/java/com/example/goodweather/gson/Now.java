package com.example.goodweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/5/9 0009.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }

}
