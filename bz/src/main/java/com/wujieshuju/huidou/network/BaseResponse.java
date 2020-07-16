package com.wujieshuju.huidou.network;

import java.util.List;
import java.util.Map;

public class BaseResponse<T> {
    public T data;
    public Map<String, List<String>> headers;
    public String msg;
    public int status;
}
