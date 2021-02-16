package com.example.demo.service;


import com.example.demo.pojo.Student;
import org.apache.ibatis.annotations.Select;

public interface StudentService {
    Student getStudentInfoByName(String xm);
    Student getStudentInfoById(Integer xh);
}
