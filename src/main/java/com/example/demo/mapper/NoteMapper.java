package com.example.demo.mapper;

import com.example.demo.pojo.Note;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface NoteMapper {
    @Select("SELECT * FROM `note` where `note`.sc=0 ORDER BY `note`.rq DESC")
    Note[] getNotes();

    @Insert("INSERT INTO `note` (dx,rq,bt,nr,sc) VALUES ( #{dx}, #{rq}, #{bt},#{nr}, 0) ")
    Integer addNote(@Param("dx") String dx,@Param("rq") String rq,@Param("bt") String bt,@Param("nr") String nr);

}
