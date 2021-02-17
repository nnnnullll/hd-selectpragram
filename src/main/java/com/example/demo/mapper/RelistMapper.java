package com.example.demo.mapper;

import com.example.demo.pojo.Relist;

import com.example.demo.pojo.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface RelistMapper {
    @Select("select yxid,ktm,ktxz,ktly,xm,xkrs,xbrs from " +
            "(select yxid,xm,prepick.gh from prepick,teacher where prepick.gh=teacher.gh) a," +
            "(select ktm,ktxz,ktly,xbrs,prepick.gh from prepick,title where prepick.kth=title.kth and prepick.gh=title.gh) b," +
            "(select count(c.xh) xkrs from prepick c,prepick d where c.kth=d.kth) e where a.gh=b.gh ORDER BY yxid desc")
     List<Relist> getRelist();
//    static List<Relist> getRelist(){
//        return RelistMapper.getRelist();
//    }


    @Update("update prepick set xh=#{xh} where yxid=#{yxid}")
    void updateStudent(@Param("xh") Integer xh, @Param("yxid") Integer yxid);


}
