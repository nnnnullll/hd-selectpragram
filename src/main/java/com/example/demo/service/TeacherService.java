package com.example.demo.service;

import com.example.demo.pojo.Teacher;
import com.example.demo.pojo.TeacherSelect;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface TeacherService {
    Teacher getTeacherInfoByName( String yhm);
    Teacher getTeacherInfoById(Integer gh);
    void renewTeacherInfo(Integer xh,String xm,String mm,Integer yxh, String xl,String zc,String xb,String yx,
                          String qq,String sjh, String zwjs,String jglb, String szyjs,String bgsdh,String bgsdz);
    void resetpwd (Integer gh,String mm);
}
