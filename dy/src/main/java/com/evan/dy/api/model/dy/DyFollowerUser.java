package com.evan.dy.api.model.dy;

import com.evan.dy.utils.JsonUtils;

import java.util.List;

public class DyFollowerUser extends BaseSN<DyFollowerUser> {
    public List<Object> followers;
    public boolean has_more;
    public int total;
    public long min_time;
    public int offset;
    public boolean rec_has_more = true;
    public int hotsoon_has_more;
    public String hotsoon_text;
    public int vcd_count;

    @Override
    public DyFollowerUser parseFrom(Object obj) {
        return JsonUtils.parseBySerializedName(obj, DyFollowerUser.class);
    }
}
