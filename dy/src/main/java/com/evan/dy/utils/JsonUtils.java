package com.evan.dy.utils;

import android.text.TextUtils;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import org.json.JSONObject;

import java.io.Reader;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;

public class JsonUtils {
    private static Gson create() {

        return JsonUtils.GSonHolder.gson;
    }

    public static <T> T parseBySerializedName(Object obj, Class<T> classOfT) {
        T t = null;
        try {
            t = classOfT.newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        Field[] fields = obj.getClass().getFields();
        if (fields == null || fields.length == 0) {
            return t;
        }
        for (Field field : fields) {
//            Annotation annotation = field.getAnnotation(SerializedName.class);
            Annotation[] annotations = field.getAnnotations();
            if (annotations == null || annotations.length == 0) {
//                Log.e("JsonUtils", "serializedName= annotation null") ;
                continue;
            }
            Annotation annotation = annotations[0];
//            @com.google.gson.annotations.SerializedName(alternate=[], value=userName)
            if (annotation != null) {
                String subString = annotation.toString();
                if (!TextUtils.isEmpty(subString) && subString.contains("value=")) {
                    int start = subString.indexOf("value=");
                    String serializedName = subString.substring(start + "value=".length(), subString.length() - 1);
                    try {
                        if (!TextUtils.isEmpty(serializedName)) {
                            Field fieldT = t.getClass().getField(serializedName);
                            if (fieldT == null && t.getClass() != null && t.getClass().getSuperclass() != null) {
                                fieldT = t.getClass().getSuperclass().getField(serializedName);
                            }
                            if (fieldT != null) {
                                Field serializedNameField = classOfT.getField(serializedName);
                                serializedNameField.set(t, field.get(obj));
                            }
                        }
                    } catch (Exception e) {
//                        Log.e("JsonUtils", "serializedName=" + serializedName + "e=" + e.getMessage());
                    }
                }
            } else {
                Log.e("JsonUtils", "annotation=null");
            }
        }
        return t;
    }

    public static JSONObject parseBySerializedName2JsonObject(Object obj) {
        JSONObject t = new JSONObject();
        Field[] fields = obj.getClass().getFields();
        if (fields == null || fields.length == 0) {
            return t;
        }
        for (Field field : fields) {
            Annotation[] annotations = field.getAnnotations();
            if (annotations == null || annotations.length == 0) {
//                Log.e("JsonUtils", "serializedName= annotation null") ;
                continue;
            }
            Annotation annotation = annotations[0];
//            @com.google.gson.annotations.SerializedName(alternate=[], value=userName)
            if (annotation != null) {
                String subString = annotation.toString();
                if (!TextUtils.isEmpty(subString) && subString.contains("value=")) {
                    int start = subString.indexOf("value=");
                    String serializedName = subString.substring(start + "value=".length(), subString.length() - 1);
                    try {
                        if (!TextUtils.isEmpty(serializedName)) {
                            t.put(serializedName, field.get(obj));
                        }
                    } catch (Exception e) {
                        Log.e("", "serializedName=" + serializedName + "e=" + e.getMessage());
                    }
                }
            }
        }
        return t;
    }

    private static class GSonHolder {

        private static Gson gson = new Gson();
    }

    public static <T> T fromJson(String json, Class<T> type) throws JsonIOException, JsonSyntaxException {
        return create().fromJson(json, type);
    }

    public static <T> T fromJsonObject(JSONObject jsonObject, Class<T> type) throws JsonIOException, JsonSyntaxException {
        return create().fromJson(jsonObject.toString(), type);
    }

    public static <T> T fromJson(String json, Type type) {
        return create().fromJson(json, type);
    }

    public static <T> T fromJson(JsonReader reader, Type typeOfT) throws JsonIOException, JsonSyntaxException {
        return create().fromJson(reader, typeOfT);
    }

    public static <T> T fromJson(Reader json, Class<T> classOfT) throws JsonSyntaxException, JsonIOException {
        return create().fromJson(json, classOfT);
    }

    public static <T> T fromJson(Reader json, Type typeOfT) throws JsonIOException, JsonSyntaxException {
        return create().fromJson(json, typeOfT);
    }


    public static String toJson(Object src) {
        return create().toJson(src);
    }

    public static String toJson(Object src, Type typeOfSrc) {
        return create().toJson(src, typeOfSrc);
    }

}
