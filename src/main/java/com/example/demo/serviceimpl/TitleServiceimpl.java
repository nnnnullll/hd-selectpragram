package com.example.demo.serviceimpl;

import com.example.demo.mapper.TitleMapper;
import com.example.demo.pojo.Title;
import com.example.demo.service.TitleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TitleServiceimpl implements TitleService{
    @Autowired
    TitleMapper titleMapper;
    public Title getTitleBykth(Integer kth){
        return titleMapper.getTitleBykth(kth);
    }
}
