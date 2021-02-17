package com.example.demo.mapper;

import com.example.demo.pojo.Note;
import com.example.demo.pojo.Title;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface TitleMapper {
    @Select("SELECT * FROM title where sc=0 AND kth=#{kth} ORDER BY fbsj DESC")
    Title getTitleBykth(@Param("kth") Integer kth);

    @Insert("INSERT INTO `title` (yxh,gh,xbrs,ktm,ktjs,ktlb,ktxz,ktly,sfxkt,zt,fbsj,sc) VALUES ( #{yxh}, #{gh}, #{xbrs},#{ktm},#{ktjs},#{ktlb},#{ktxz},#{ktly},#{sfxkt},0,#{fbsj}, 0) ")
    Integer addTitle(
        @Param("yxh") Integer yxh,
        @Param("gh") Integer gh,
        @Param("xbrs") Integer xbrs,
        @Param("ktm") String ktm,
        @Param("ktjs") String ktjs,
        @Param("ktlb") String ktlb,
        @Param("ktxz") String ktxz,
        @Param("ktly") String ktly,
        @Param("sfxkt") Integer sfxkt,
        @Param("fbsj") String fbsj);

    // @Update("update `note` set `note`.sc=1  where `note`.ggh=#{ggh}")
    // Integer deleteNote(@Param("ggh") Integer ggh);

}

