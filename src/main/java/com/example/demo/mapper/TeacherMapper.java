package com.example.demo.mapper;

import com.example.demo.pojo.Student;
import com.example.demo.pojo.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface TeacherMapper {
    @Select("SELECT * FROM teacher WHERE xm=#{xm}")
    Teacher getTeacherInfoByName(String xm);
    @Select("SELECT * FROM teacher WHERE gh=#{gh}")
    Teacher getTeacherInfoById(Integer gh);

    @Update("update teacher set xm=#{xm},mm=#{mm},yxh=#{yxh},xl=#{xl},zc=#{zc},xb=#{xb},yx=#{yx},qq=#{qq}," +
            "sjh=#{sjh},zwjs=#{zwjs},jglb=#{jglb},szyjs=#{szyjs},bgsdh=#{bgsdh},bgsdz=#{bgsdz} where gh=#{gh}")
    void renewTeacherInfo(@Param("gh") Integer xh, @Param("xm") String xm, @Param("mm")String mm, @Param("yxh") Integer yxh,
                          @Param("xl")String xl,@Param("zc")String zc, @Param("xb") String xb, @Param("yx")String yx,
                          @Param("qq")String qq, @Param("sjh") String sjh, @Param("zwjs") String zwjs,@Param("jglb")String jglb,
                          @Param("szyjs")String szyjs,@Param("bgsdh")String bgsdh,@Param("bgsdz")String bgsdz);
    @Update("update teacher set mm=#{mm} where gh=#{gh}")
    void resetpwd (@Param("gh")Integer gh,@Param("mm")String mm);
}
