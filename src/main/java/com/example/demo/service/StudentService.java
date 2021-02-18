package com.example.demo.service;


import com.example.demo.pojo.Student;
import org.apache.ibatis.annotations.Select;

public interface StudentService {
    Student getStudentInfoByName(String xm);
    Student getStudentInfoById(Integer xh);
    String renewStudentInfo(Integer xh,String xm,String mm,Integer yxh,String zy,String nj,String xb,String yx,String qq,
                          String sjh,String zwjs);
    void resetpwd (Integer xh,String mm);
}
