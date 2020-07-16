package com.evan.dy.utils;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class BeanUtils {
    @Nullable
    public static <T> T copy(@NotNull Class<T> type, @NotNull Object info) {
        String json = JsonUtils.toJson(info);
        return JsonUtils.fromJson(json, type);
    }
}
