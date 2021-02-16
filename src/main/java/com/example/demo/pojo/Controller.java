package com.example.demo.pojo;

import lombok.Data;

@Data
public class Controller {
    Integer glyh;
    String xm;
    String mm;
    String cz;

    public Integer getGlyh() {
        return glyh;
    }

    public void setGlyh(Integer glyh) {
        this.glyh = glyh;
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getMm() {
        return mm;
    }

    public void setMm(String mm) {
        this.mm = mm;
    }

    public String getCz() {
        return cz;
    }

    public void setCz(String cz) {
        this.cz = cz;
    }
}
