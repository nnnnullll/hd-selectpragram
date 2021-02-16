package com.example.demo.mapper;

import com.example.demo.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface StudentMapper {
    @Select("SELECT * FROM student WHERE xm=#{xm}")
    Student getStudentInfoByName(String xm);
    @Select("SELECT * FROM student WHERE xh=#{xh}")
    Student getStudentInfoById(Integer xh);
    @Update("update student set xm=#{xm},mm=#{mm},yxh=#{yxh},zy=#{zy},nj=#{nj},xb=#{xb},yx=#{yx},qq=#{qq},sjh=#{sjh},zwjs=#{zwjs} where xh=#{xh}")
    void renewStudentInfo(@Param("xh") Integer xh,@Param("xm") String xm,@Param("mm")String mm,@Param("yxh") Integer yxh,
                          @Param("zy")String zy,@Param("nj") String nj,@Param("xb") String xb, @Param("yx")String yx,
                          @Param("qq")String qq,@Param("sjh") String sjh,@Param("zwjs") String zwjs);
}
