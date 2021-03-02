package com.example.demo.service;

import com.example.demo.pojo.TeacherSelect;

import java.util.List;

public interface LastPickService {
    void addLastPick(Integer gh,Integer xh,Integer kth);
    List<TeacherSelect> getprektList(Integer gh);
    List<TeacherSelect> getlstktList(Integer gh);
}
