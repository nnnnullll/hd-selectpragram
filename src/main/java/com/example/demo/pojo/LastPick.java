package com.example.demo.pojo;

import lombok.Data;

@Data
public class LastPick {
    Integer zzh;
    Integer xh;
    Integer gh;
    Integer kth;

    public LastPick( Integer xh, Integer gh, Integer kth) {
        this.xh = xh;
        this.gh = gh;
        this.kth = kth;
    }

    public Integer getZzh() {
        return zzh;
    }

    public Integer getXh() {
        return xh;
    }

    public Integer getGh() {
        return gh;
    }

    public Integer getKth() {
        return kth;
    }

    public void setZzh(Integer zzh) {
        this.zzh = zzh;
    }

    public void setXh(Integer xh) {
        this.xh = xh;
    }

    public void setGh(Integer gh) {
        this.gh = gh;
    }

    public void setKth(Integer kth) {
        this.kth = kth;
    }
}
