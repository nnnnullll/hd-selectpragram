package com.example.demo.controller;

import com.example.demo.pojo.Title;
import com.example.demo.service.TitleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class TitleController {
    @Autowired
    TitleService titleService;
    @PostMapping("/gettitlebykth")
    public Title getTitleByggh(@RequestParam(value = "kth") Integer kth) {
        return titleService.getTitleBykth(kth);
    }
}
