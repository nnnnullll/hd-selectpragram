package com.example.demo.serviceimpl;

import com.example.demo.mapper.StudentMapper;
import com.example.demo.pojo.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;
    @Override
    public Student getStudentInfoByName(String xm) {
        return  studentMapper.getStudentInfoByName(xm);
    }

}