package com.example.demo.mapper;

import com.example.demo.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

//mapper层就是dao层，对数据进行增删改查处理
@Mapper
public interface UserMapper {
    
    @Select("SELECT * FROM user WHERE yhid=#{yhid}")
    User getUserInfoById(@Param("yhid") Integer yhid);

    @Select("SELECT * FROM user WHERE yhm=#{yhm}")
    User getUserInfoByName(@Param("yhm") String yhm);

    @Select("SELECT * FROM user WHERE yhm like CONCAT('%',#{yhm},'%')")
    List<User> getUserInfoBySimilarName(@Param("yhm") String yhm);

    @Select("SELECT * FROM user WHERE yx=#{yx}")
    List<User> getUserInfoByYx(@Param("yx") String yx);

  }



