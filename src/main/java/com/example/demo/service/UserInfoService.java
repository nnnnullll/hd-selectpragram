package com.example.demo.service;
import com.example.demo.pojo.User;

import java.util.List;

public interface UserInfoService {
    User getUserInfoById( Integer yhid);
    User getUserInfoByName( String yhm);
    List<User> getUserInfoBySimilarName(String yhm);
    List<User> getUserInfoByYx(String yx);
}
