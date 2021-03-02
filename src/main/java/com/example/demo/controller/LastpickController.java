package com.example.demo.controller;

import com.example.demo.pojo.TeacherSelect;
import com.example.demo.service.LastPickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class LastpickController {
    @Autowired
    LastPickService lastPickService;

    @PostMapping("/getprektlist")
    public List<TeacherSelect> getprektList(
            @RequestParam(value = "gh") Integer gh) {
        return lastPickService.getprektList(gh);
    }

    @PostMapping("/addFinal")
    public void addFinal(
            @RequestParam(value = "gh") Integer gh,
            @RequestParam(value = "xh") Integer xh,
            @RequestParam(value = "kth") Integer kth){
        lastPickService.addLastPick(gh,xh,kth);
    }

    @PostMapping("/getlastktlist")
    public List<TeacherSelect> getlstktList(@RequestParam(value = "gh") Integer gh) {
        return lastPickService.getlstktList(gh);
    }
}
