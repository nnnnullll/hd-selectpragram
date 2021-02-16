package com.example.demo.service;

import com.example.demo.pojo.Controller;
import com.example.demo.pojo.Student;
import com.example.demo.pojo.Teacher;

import java.util.Date;
public interface TokenService {
    public  String getToken(Student user, Date date);
    public  String getToken(Teacher user, Date date);
    public  String getToken(Controller user, Date date);

}
