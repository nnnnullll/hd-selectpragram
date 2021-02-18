package com.example.demo.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface TimeMapper {
    @Update("update `teacher` set `teacher`.cz=2 ")
    Integer upTeachercz2();
    @Update("update `teacher` set `teacher`.cz=0 ")
    Integer upTeachercz0();
    @Update("update `teacher` set `teacher`.cz=4 ")
    Integer upTeachercz4();
    @Update("update `student` set `student`.cz=0 ")
    Integer upStudentcz0();
    @Update("update `student` set `student`.cz=1 ")
    Integer upStudentcz1();
    @Update("update `student` set `student`.cz=1,`student`.xz=0 where `student`.xz!=2")
    Integer upStudent2cz1();
    @Delete("delete from prepick")
    void deleteprepick();

}
