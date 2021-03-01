package com.example.demo.pojo;

public class Relist {
    private int xuhao;// 展示的序号
    private int kth;
    private String ktm;//  课题名
    private String ktxz;//  课题性质
    private String ktly;//  课题来源
    private int gh;
    private String xm;//  指导老师
    private int xbrs;// 限报人数
    private int xkrs;//  选课人数

    public Relist(int xuhao,int kth, String ktm, String ktxz, String ktly, int gh,String xm, int xbrs, int xkrs) {
        this.xuhao=xuhao;
        this.kth = kth;
        this.ktm = ktm;
        this.ktxz = ktxz;
        this.ktly = ktly;
        this.gh=gh;
        this.xm = xm;
        this.xbrs = xbrs;
        this.xkrs = xkrs;
    }

    public int getXuhao() {
        return xuhao;
    }

    public int getKth() { return kth; }

    public String getKtm() {
        return ktm;
    }

    public String getKtxz() {
        return ktxz;
    }

    public String getKtly() {
        return ktly;
    }

    public int getGh() {
        return gh;
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


    public void setXuhao(int xuhao) {
        this.xuhao = xuhao;
    }

    public void setKth(int kth) { this.kth = kth; }

    public void setXkrs(int xkrs) {
        this.xkrs = xkrs;
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

    public void setGh(int gh) {
        this.gh = gh;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public void setXbrs(int xbrs) {
        this.xbrs = xbrs;
    }

}