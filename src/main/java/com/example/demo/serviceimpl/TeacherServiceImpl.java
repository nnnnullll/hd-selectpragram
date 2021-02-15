package com.example.demo.serviceimpl;

import com.example.demo.mapper.TeacherMapper;
import com.example.demo.pojo.Teacher;
import com.example.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    TeacherMapper teacherMapper;
    @Override
    public Teacher getTeacherInfoByName(String yhm) {
        return  teacherMapper.getTeacherInfoByName(yhm);
    }
}
