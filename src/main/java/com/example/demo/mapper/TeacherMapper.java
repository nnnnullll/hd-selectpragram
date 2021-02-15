package com.example.demo.mapper;

import com.example.demo.pojo.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TeacherMapper {
    @Select("SELECT * FROM teacher WHERE xm=#{xm}")
    Teacher getTeacherInfoByName(String xm);
}
