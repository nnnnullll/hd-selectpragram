package com.example.demo.controller;

import com.example.demo.pojo.Teacher;
import com.example.demo.service.TeacherService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class TeacherController {
    @Autowired
    TeacherService teacherService;
    @PostMapping("/getteacherbygh")
    public Teacher getTeacherBygh(@RequestParam(value = "gh") Integer gh) {
        return teacherService.getTeacherInfoById(gh);
    }
}
