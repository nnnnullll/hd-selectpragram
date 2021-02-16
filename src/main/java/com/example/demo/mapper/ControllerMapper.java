package com.example.demo.mapper;

import com.example.demo.pojo.Controller;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ControllerMapper {
    @Select("SELECT * FROM controller WHERE xm=#{xm}")
    Controller getControllerInfoByName(String xm);
    @Select("SELECT * FROM controller WHERE glyh=#{glyh}")
    Controller getControllerInfoById(Integer glyh);
}
