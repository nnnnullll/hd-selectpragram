package com.example.demo.service;

import com.example.demo.pojo.Title;

import java.util.List;

public interface TitleService {
    Title getTitleBykth(Integer kth);
    Integer addTitle(Integer yxh,Integer gh,Integer xbrs,String ktm,String ktjs,String ktlb,String ktxz,String ktly,Integer sfxkt,String fbsj);
    Integer upTitle(Integer kth,Integer xbrs,String ktm,String ktjs,String ktlb,String ktxz,String ktly,Integer sfxkt,String fbsj);
    Title[] getTitleBygh(Integer gh);
    Title[] getBadTitleBygh(Integer gh);
    Integer deletekt(Integer kth);
    void matchUnselected();
    Integer getlastTitleidByxh(Integer xh);
    Integer getpreTitleidByxh(Integer xh);
    List<Title> getAllTitles();
    Integer titleState1(Integer kth);
    Integer titleState3(Integer kth);
    Integer titleState2(Integer kth);
}

