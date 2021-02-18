package com.example.demo.pojo;

import lombok.Data;

@Data
public class UnSelKt {
    Integer kth;
    Integer gh;

    public Integer getKth() {
        return kth;
    }

    public void setKth(Integer kth) {
        this.kth = kth;
    }

    public Integer getGh() {
        return gh;
    }

    public void setGh(Integer gh) {
        this.gh = gh;
    }
}
