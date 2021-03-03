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

    @PostMapping("/getmyselect")
    public Integer getMyselect(@RequestParam(value = "xh") Integer xh) {
        return preregistService.getMyselect(xh);
    }


    //报名，设置状态
    @PostMapping("/studentSign1")
    public Integer studentSign1(
            @RequestParam(value = "kth") Integer kth,
            @RequestParam(value = "gh") Integer gh,
            @RequestParam(value = "xh") Integer xh){
        return preregistService.studentSign1(kth,gh,xh);
    }

    @PostMapping("/studentState1")
    public Integer studentState1(
            @RequestParam(value = "xh") Integer xh){
        return preregistService.studentState1(xh);
    }

    //取消报名，恢复状态
    @PostMapping("/studentSign0")
    public Integer studentSign0(
            @RequestParam(value = "kth") Integer kth,
            @RequestParam(value = "gh") Integer gh,
            @RequestParam(value = "xh") Integer xh){
        return preregistService.studentSign0(kth,gh,xh);
    }

    @PostMapping("/studentState0")
    public Integer studentState0(
            @RequestParam(value = "xh") Integer xh){
        return preregistService.studentState0(xh);
    }

    @PostMapping("/studentState2")
    public Integer studentState2(
            @RequestParam(value = "xh") Integer xh){
        return preregistService.studentState2(xh);
    }

    @PostMapping("/isxz1")
    public Integer getXZ1(@RequestParam(value = "xh") Integer xh){
        return preregistService.getXZ1(xh);
    }
}
