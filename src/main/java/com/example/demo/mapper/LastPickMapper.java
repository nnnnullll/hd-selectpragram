package com.example.demo.mapper;

import com.example.demo.pojo.Student;
import com.example.demo.pojo.Title;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface LastPickMapper {
    @Insert("INSERT INTO `lastpick` (gh,xh,kth) VALUES ( #{gh}, #{xh}, #{kth}) ")
    @Options(useGeneratedKeys = true)
    void addLastPick(@Param("gh") Integer gh, @Param("xh") Integer xh, @Param("kth") Integer kth);

    @Select("select * from `title` where `title`.kth in (select kth from `prepick` where kth not in (select kth from `lastpick` where `lastpick`.gh=#{gh}))")
    List<Title> getprektList(@Param("gh")Integer gh);


    @Select("select * from student where xh in(select xh from prepick where prepick.kth=#{kth})")
    List<Student> getAllStudent(@Param("kth")Integer kth);


    @Select("select * from `title` where `title`.kth in (select kth from `lastpick` where `lastpick`.gh=#{gh} group by kth)")
    List<Title> getlastktList(@Param("gh")Integer gh);
}
