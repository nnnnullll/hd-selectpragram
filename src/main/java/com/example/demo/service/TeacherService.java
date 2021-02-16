package com.example.demo.service;

import com.example.demo.pojo.Teacher;
import io.swagger.models.auth.In;

public interface TeacherService {
    Teacher getTeacherInfoByName( String yhm);
    Teacher getTeacherInfoById(Integer gh);
}
