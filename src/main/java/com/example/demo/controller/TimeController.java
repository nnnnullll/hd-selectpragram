package com.example.demo.controller;

import com.example.demo.service.TimeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class TimeController {
    @Autowired
    TimeService timeService;
    @PostMapping("/openteacheradd")
    public void openteacheradd(){
        timeService.openteacheradd();
    }
    @PostMapping("/openteacheraccept")
    public  void openteacheraccept(){
        timeService.openteacheraccept();
    }
    @PostMapping("/closeteacher")
    public  void closeteacher(){
        timeService.closeteacher();
    }
    @PostMapping("/openstudentadd")
    public  void openstudentadd(){
        timeService.openstudentadd();
    }
    @PostMapping("/openstudent2add")
    public  void openstudent2add(){
        timeService.openstudent2add();
    }
    @PostMapping("/closestudentadd")
    public  void closestudentadd(){
        timeService.closestudentadd();
    }
}
