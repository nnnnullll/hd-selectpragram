package com.example.demo.service;

import com.example.demo.pojo.Student;
import com.example.demo.pojo.Teacher;
import com.example.demo.pojo.User;
import java.util.Date;
public interface TokenService {
    public  String getToken(User user, Date date);
    public  String getToken(Student user, Date date);
    public  String getToken(Teacher user, Date date);
}
