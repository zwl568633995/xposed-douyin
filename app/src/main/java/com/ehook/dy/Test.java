package com.ehook.dy;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Test implements Serializable {
    @SerializedName("userName")
    public String n;
    @SerializedName("age")
    public String age;
    @SerializedName("xx")
    public String xx;
}
