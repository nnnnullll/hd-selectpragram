package com.example.demo.serviceimpl;

import com.example.demo.mapper.LastPickMapper;
import com.example.demo.mapper.TitleMapper;
import com.example.demo.service.LastPickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LastPickServiceImpl implements LastPickService {
    @Autowired
    LastPickMapper lastPickMapper;
    @Override
    public void addLastPick(Integer gh,Integer xh,Integer kth){
        lastPickMapper.addLastPick(gh, xh, kth);
    }
}
