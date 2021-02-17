package com.example.demo.controller;

import com.example.demo.pojo.Relist;
import com.example.demo.service.PreregistService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class PreregistController {
    @Autowired
    PreregistService preregistService;
    @PostMapping("/getrelist")
    public List<Relist> getRelist() {
        return preregistService.getRelist();
    }
    // http://localhost:8010/addnote?dx=学生&bt=测试标题&nr=测试内容&rq=2000-01-02

    @PostMapping("/studentSign")
    public Integer studentSign(
            @RequestParam(value = "xh") Integer xh,
            @RequestParam(value = "yxid") Integer yxid){
         preregistService.updateStudent(xh,yxid);
         return 1;
    }
}
