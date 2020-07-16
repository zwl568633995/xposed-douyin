package com.evan.socket;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.LongSerializationPolicy;

import java.lang.reflect.Type;

public class JsonUtil {
    public static String toJson(Object obj) {
        return new Gson().toJson(obj);
    }

    public static  <T> T fromObj(Object obj, Class<T> classOfT) throws JsonSyntaxException {
        return new Gson().fromJson(toJson(obj), classOfT);
    }
    public static  <T> T fromJson(String json, Class<T> classOfT) throws JsonSyntaxException {
        return new Gson().fromJson(json, classOfT);
    }

    public static  <T> T fromJson(String json, Type typeOfT) throws JsonSyntaxException {
        return new Gson().fromJson(json, typeOfT);
    }
}
