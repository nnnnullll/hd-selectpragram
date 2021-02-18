package com.example.demo.service;

import com.example.demo.pojo.Controller;

public interface ControllerService {
     Controller getControllerInfoByName(String xm);
     Controller getControllerInfoById(Integer glyh);
     void resetPwd(Integer glyh,String mm);
}
