package com.example.demo.serviceimpl;

import com.example.demo.pojo.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User getUserInfoById(Integer yhid) {
        return  userMapper.getUserInfoById(yhid);
    }

    @Override
    public User getUserInfoByName(String yhm) {
        return  userMapper.getUserInfoByName(yhm);
    }

    @Override
    public List<User> getUserInfoBySimilarName(String yhm) {
        return  userMapper.getUserInfoBySimilarName(yhm);
    }

    @Override
    public List<User> getUserInfoByYx(String yx) {
        return  userMapper.getUserInfoByYx(yx);
    }




}


