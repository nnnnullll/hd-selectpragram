package com.example.demo.controller;

import com.beust.jcommander.internal.Console;
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
    @PostMapping("/addtitle")
    public Integer addTitle(
        @RequestParam(value = "yxh") Integer yxh,
        @RequestParam(value = "gh") Integer gh,
        @RequestParam(value = "xbrs") Integer xbrs,
        @RequestParam(value = "ktm") String ktm,
        @RequestParam(value = "ktjs") String ktjs,
        @RequestParam(value = "ktlb") String ktlb,
        @RequestParam(value = "ktxz") String ktxz,
        @RequestParam(value = "ktly") String ktly,
        @RequestParam(value = "sfxkt") Integer sfxkt,
        @RequestParam(value = "fbsj") String fbsj){
        System.out.println(yxh);
        System.out.println(gh);
        System.out.println(xbrs);
        System.out.println(ktm);
        return titleService.addTitle(yxh, gh, xbrs, ktm, ktjs, ktlb, ktxz, ktly, sfxkt, fbsj);
    }
}
