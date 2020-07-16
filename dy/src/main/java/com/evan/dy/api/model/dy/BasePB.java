package com.evan.dy.api.model.dy;

import androidx.annotation.NonNull;

import com.google.gson.Gson;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public abstract class BasePB<T> implements Serializable {
    @NonNull
    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }

    /**
     * 企业微信Model
     *
     * @return
     */
    public Object getMirror() {
        return null;
    }

    public <P> P toMirror(Class<P> clazz) {
        Gson gson = new Gson();
        return gson.fromJson(gson.toJson(this), clazz);
    }

    /**
     * 本地bean
     *
     * @param obj
     * @return
     */
    public T parseFrom(Object obj) {
        Gson gson = new Gson();
        Type genType = getClass().getGenericSuperclass();
        Type rawType = ((ParameterizedType) genType).getActualTypeArguments()[0];
        return gson.fromJson(gson.toJson(obj), rawType);
    }

}
