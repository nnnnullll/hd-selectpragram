package com.example.demo.serviceimpl;

import com.example.demo.mapper.LastPickMapper;
import com.example.demo.mapper.TeacherMapper;
import com.example.demo.pojo.*;
import com.example.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    TeacherMapper teacherMapper;
    LastPickMapper lastPickMapper;
    @Override
    public Teacher getTeacherInfoByName(String yhm) {
        return  teacherMapper.getTeacherInfoByName(yhm);
    }
    @Override
    public Teacher getTeacherInfoById(Integer gh) {
        return  teacherMapper.getTeacherInfoById(gh);
    }

    @Override
    public void renewTeacherInfo(Integer xh, String xm, String mm, Integer yxh, String xl, String zc, String xb, String yx, String qq, String sjh, String zwjs, String jglb, String szyjs, String bgsdh, String bgsdz) {
        teacherMapper.renewTeacherInfo(xh, xm, mm, yxh, xl, zc, xb, yx, qq, sjh, zwjs, jglb, szyjs, bgsdh, bgsdz);
    }
    @Override
    public void resetpwd (Integer gh,String mm){
        teacherMapper.resetpwd(gh,mm);
    }


}
