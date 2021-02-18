package com.example.demo.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface LastPickMapper {
    @Insert("INSERT INTO `lastpick` (gh,xh,kth) VALUES ( #{gh}, #{xh}, #{kth}) ")
    @Options(useGeneratedKeys = true)
    void addLastPick(@Param("gh") Integer gh, @Param("xh") Integer xh, @Param("kth") Integer kth);
}
