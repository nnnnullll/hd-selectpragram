package com.example.demo.pojo;

public class Relist {
    private int yxid;//  预选号--序号
    private String ktm;//  课题名
    private String ktxz;//  课题性质
    private String ktly;//  课题来源
    private String xm;//  指导老师
    private int xbrs;// 限报人数
    private int xkrs;//  选课人数

    public Relist(int yxid, String ktm, String ktxz, String ktly, String xm, int xbrs, int xkrs) {
        this.yxid = yxid;
        this.ktm = ktm;
        this.ktxz = ktxz;
        this.ktly = ktly;
        this.xm = xm;
        this.xbrs = xbrs;
        this.xkrs = xkrs;
    }

    public int getYxid() {
        return yxid;
    }

    public String getKtm() {
        return ktm;
    }

    public String getKtxz() {
        return ktxz;
    }

    public String getKtly() {
        return ktly;
    }

    public String getXm() {
        return xm;
    }

    public int getXbrs() {
        return xbrs;
    }

    public int getXkrs() {
        return xkrs;
    }

    public void setXkrs(int xkrs) {
        this.xkrs = xkrs;
    }

    public void setYxid(int yxid) {
        this.yxid = yxid;
    }

    public void setKtm(String ktm) {
        this.ktm = ktm;
    }

    public void setKtxz(String ktxz) {
        this.ktxz = ktxz;
    }

    public void setKtly(String ktly) {
        this.ktly = ktly;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public void setXbrs(int xbrs) {
        this.xbrs = xbrs;
    }


}
