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
    public Title getTitleBykth(@RequestParam(value = "kth") Integer kth) {
        return titleService.getTitleBykth(kth);
    }
    @PostMapping("/getlastTitleidByxh")
    public Integer getlastTitleidByxh(@RequestParam(value = "xh") Integer xh) {
        try {
            return titleService.getlastTitleidByxh(xh);
        } catch (Exception e) {
            return 0;
        }
        
    }
    @PostMapping("/getpreTitleidByxh")
    public Integer getpreTitleidByxh(@RequestParam(value = "xh") Integer xh) {
        try {
            return titleService.getpreTitleidByxh(xh);
        } catch (Exception e) {
            return 0;
        }
        
    }
    @PostMapping("/gettitlebygh")
    public Title[] getTitleBygh(@RequestParam(value = "gh") Integer gh) {
        return titleService.getTitleBygh(gh);
    }
    @PostMapping("/getbadtitlebygh")
    public Title[] getBadTitleBygh(@RequestParam(value = "gh") Integer gh) {
        return titleService.getBadTitleBygh(gh);
    }
    @PostMapping("/deletetitle")
    public Integer deleteTitle(@RequestParam(value = "kth") Integer kth) {
        return titleService.deletekt(kth);
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
        return titleService.addTitle(yxh, gh, xbrs, ktm, ktjs, ktlb, ktxz, ktly, sfxkt, fbsj);
    }

    @PostMapping("/uptitle")
    public Integer upTitle(
        @RequestParam(value = "kth") Integer kth,
        @RequestParam(value = "xbrs") Integer xbrs,
        @RequestParam(value = "ktm") String ktm,
        @RequestParam(value = "ktjs") String ktjs,
        @RequestParam(value = "ktlb") String ktlb,
        @RequestParam(value = "ktxz") String ktxz,
        @RequestParam(value = "ktly") String ktly,
        @RequestParam(value = "sfxkt") Integer sfxkt,
        @RequestParam(value = "fbsj") String fbsj){
        return titleService.upTitle(kth,xbrs, ktm, ktjs, ktlb, ktxz, ktly, sfxkt, fbsj);
    }
}
