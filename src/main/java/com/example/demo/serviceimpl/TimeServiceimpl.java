package com.example.demo.serviceimpl;

import com.example.demo.mapper.TimeMapper;
import com.example.demo.service.TimeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TimeServiceimpl implements TimeService{
    @Autowired 
    TimeMapper timeMapper;
    // 开启老师发布课题
    @Override
    public void openteacheradd() {
        timeMapper.upTeachercz2();
    }
    //开启教师接收学生
    @Override
    public void openteacheraccept() {
        timeMapper.upTeachercz4();
    }
    //关闭老师操作
    @Override
    public void closeteacher(){
        timeMapper.upTeachercz0();
    }
    //开启学生选课题
    @Override
    public  void openstudentadd(){
        timeMapper.upStudentcz1();
        timeMapper.deleteprepick();
    }
    @Override
    public  void openstudent2add(){
        timeMapper.upStudent2cz1();
        timeMapper.deleteprepick();
    }
    //关闭学生选课题
    @Override
    public void closestudentadd() {
        timeMapper.upStudentcz0();
    }
    
}
