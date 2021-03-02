package com.example.demo.service;

import com.example.demo.pojo.Relist;

import java.util.List;

public interface PreregistService {
    List<Relist> getRelist();

    Integer getMyselect(Integer xh);

    //    学生选择
    Integer studentSign1(Integer kth, Integer gh, Integer xh);

    Integer studentState1(Integer xh);

    //    学生取消
    Integer studentState0(Integer xh);

    Integer studentSign0(Integer kth, Integer gh, Integer xh);

    //   学生进入最终表
    Integer studentState2(Integer xh);
}
