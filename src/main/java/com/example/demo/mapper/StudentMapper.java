package com.example.demo.mapper;

import com.example.demo.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface StudentMapper {
    @Select("SELECT * FROM student WHERE xm=#{xm}")
    Student getStudentInfoByName(String xm);
}
