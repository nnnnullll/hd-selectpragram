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

    // 通过工号找审核前的课题 
    @Select("SELECT * FROM title where sc=0 AND gh=#{gh} AND zt=0 ORDER BY fbsj DESC")
    Title[] getTitleBygh(@Param("gh") Integer gh);
     // 通过工号找审核不通过的课题 
     @Select("SELECT * FROM title where sc=0 AND gh=#{gh} AND zt=3 ORDER BY fbsj DESC")
     Title[] getBadTitleBygh(@Param("gh") Integer gh);

    @Update("update `title` set `title`.sc=1  where `title`.kth=#{kth}")
    Integer deletekt(@Param("kth") Integer kth);

    @Update("update `title` set xbrs=#{xbrs},ktm=#{ktm},ktjs=#{ktjs},ktlb=#{ktlb},ktxz=#{ktxz},ktly=#{ktly},sfxkt=#{sfxkt},fbsj=#{fbsj} where `title`.kth=#{kth} ")
    Integer upTitle(
        @Param("kth") Integer kth,
        @Param("xbrs") Integer xbrs,
        @Param("ktm") String ktm,
        @Param("ktjs") String ktjs,
        @Param("ktlb") String ktlb,
        @Param("ktxz") String ktxz,
        @Param("ktly") String ktly,
        @Param("sfxkt") Integer sfxkt,
        @Param("fbsj") String fbsj);

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

    

    

}

