package com.example.demo.serviceimpl;

import com.example.demo.mapper.ControllerMapper;
import com.example.demo.pojo.Controller;
import com.example.demo.service.ControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ControllerServiceImpl implements ControllerService {
    @Autowired
    ControllerMapper controllerMapper;
    @Override
    public Controller getControllerInfoByName(String xm){
        return controllerMapper.getControllerInfoByName(xm);
    }
    @Override
    public Controller getControllerInfoById(Integer glyh){
        return controllerMapper.getControllerInfoById(glyh);
    }
}
