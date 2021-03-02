package com.example.demo.pojo;

import java.util.List;

public class TeacherSelect {
    private Title kt;
    private List<Student> stuList;//选课

    public TeacherSelect(Title kt, List<Student> stuList) {
        this.kt = kt;
        this.stuList = stuList;
    }

    public Title getKt() {
        return kt;
    }

    public List<Student> getStuList() {
        return stuList;
    }

    public void setKt(Title kt) {
        this.kt = kt;
    }

    public void setStuList(List<Student> stuList) {
        this.stuList = stuList;
    }
}
