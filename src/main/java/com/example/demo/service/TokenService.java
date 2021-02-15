package com.example.demo.service;

import com.example.demo.pojo.User;

import java.util.Date;

public interface TokenService {
    public  String getToken(User user, Date date);
}
