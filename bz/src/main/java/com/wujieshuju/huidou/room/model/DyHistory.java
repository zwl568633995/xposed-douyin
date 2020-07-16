package com.wujieshuju.huidou.room.model;

public class DyHistory {

    /* renamed from: id */
    private int f990id;
    private String name;

    public int getId() {
        return this.f990id;
    }

    public void setId(int i) {
        this.f990id = i;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.name.equals(((DyHistory) obj).name);
    }
}
