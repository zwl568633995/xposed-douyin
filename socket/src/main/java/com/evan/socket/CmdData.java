package com.evan.socket;

import com.google.gson.JsonObject;

import java.io.Serializable;

public class CmdData implements Serializable {
    public String cmd;
    public String group;
    public String cid;
    public long times;
    public JsonObject data;
}
