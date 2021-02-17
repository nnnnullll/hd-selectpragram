package com.example.demo.service;

import com.example.demo.pojo.Relist;

import java.util.List;

public interface PreregistService {
    List<Relist> getRelist();

    //学生选择
    void updateStudent(Integer xh,Integer yxid);
}
