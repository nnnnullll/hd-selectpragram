package com.example.demo.mapper;

import com.example.demo.pojo.Relist;

import com.example.demo.pojo.Teacher;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface RelistMapper {

    @Select("select (@i:=@i+1)xuhao,a.kth kth,ktm,ktxz,ktly,c.gh gh,c.xm xm,xbrs,b.xkrs xkrs from (select * from title where zt=1 and sc=0 ) a,(select @i:=0)p,(select title.kth kth,count(prepick.xh) xkrs from title left join prepick on title.kth=prepick.kth group by title.kth) b,(select kth,teacher.gh gh,xm from title,teacher where title.gh=teacher.gh) c where a.kth=b.kth and a.kth=c.kth order by a.kth asc")
    List<Relist> getRelist();

    @Select("select kth from prepick where xh=#{xh}")
    Integer getMyselect(@Param("xh") Integer xh);

    @Insert("insert into prepick (kth,gh,xh) values(#{kth}, #{gh}, #{xh});")
    Integer studentSign1(@Param("kth") Integer kth,@Param("gh") Integer gh, @Param("xh") Integer xh);

    @Update("update `student` set `student`.xz=1  where `student`.xh=#{xh}")
    Integer studentState1(@Param("xh") Integer xh);

    @Update("update `student` set `student`.xz=0  where `student`.xh=#{xh}")
    Integer studentState0(@Param("xh") Integer xh);

    @Delete("delete from `prepick` where `prepick`.kth=#{kth} and `prepick`.gh=#{gh} and `prepick`.xh=#{xh}")
    Integer studentSign0(@Param("kth") Integer kth,@Param("gh") Integer gh, @Param("xh") Integer xh);

   

}
