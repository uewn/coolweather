package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/9/13.
 */
//Basic是和风天气返回数据中的一项，所以新建实体类，并把Basic中的所有信息度定义为字段。【主要是为了使用GSON解析json数据】
    //使用 【 @SerializedName 注解的方式来让JSON字段和java字段之间建立映射关系】
public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String  weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
