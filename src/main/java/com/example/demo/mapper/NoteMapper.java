package com.example.demo.mapper;

import com.example.demo.pojo.Note;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface NoteMapper {
    @Select("SELECT * FROM `note` ORDER BY `note`.rq DESC")
    Note[] getNotes();
}
