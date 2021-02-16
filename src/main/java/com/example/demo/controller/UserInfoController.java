package com.example.demo.controller;
import com.example.demo.CheckToken;
import com.example.demo.pojo.Student;
import com.example.demo.pojo.Teacher;
import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.web.bind.annotation.*;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;


@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserInfoController {

    @Autowired
    StudentService studentService;
    @Autowired
    TeacherService teacherService;

    @Autowired
    TokenService tokenService;
    @Value("${EXPIRE_TIME}")
    private String EXPIRE_TIME;



    //登录
    @PostMapping("/login")
    public Map<String, Object> login(@RequestBody Map<String,Object> user){
        Map result=new HashMap();
        Integer field=Integer.parseInt(String.valueOf(user.get("kind")));
        System.out.println("类别："+field);
        if(field==1) {
            Student userForBase=studentService.getStudentInfoByName(String.valueOf(user.get("username")));
            if(userForBase==null){
                result.put("message","登录失败,该生不存在");
                return result;
            }
            else {
                String dbPwd=userForBase.getMm();
                if (String.valueOf(user.get("password"))==dbPwd){
                    System.out.println("密码："+dbPwd);
                    System.out.println("my："+ user.get("password"));
                    result.put("message","登录失败,该生密码错误");
                    return result;
                }else {
                    Date expiresDate = new Date(System.currentTimeMillis()+Integer.valueOf(EXPIRE_TIME)*60*1000);
                    String token = tokenService.getToken(userForBase,expiresDate);
                    result.put("token", token);
                    result.put("expireTime", EXPIRE_TIME);
                    result.put("xh", userForBase.getXh());
                    result.put("xm", userForBase.getXm());
                    return result;
                }
            }
        }
        else if(field==2){
            Teacher userForBase2=teacherService.getTeacherInfoByName(String.valueOf(user.get("username")));
            if(userForBase2==null){
                result.put("message","登录失败,该教师不存在");
                return result;
            }
            else {
                String dbPwd=userForBase2.getMm();
                if (String.valueOf(user.get("password"))==dbPwd){
                    result.put("message","登录失败,该教师密码错误");
                    return result;
                }else {
                    Date expiresDate = new Date(System.currentTimeMillis()+Integer.valueOf(EXPIRE_TIME)*60*1000);
                    String token = tokenService.getToken(userForBase2,expiresDate);
                    result.put("token", token);
                    result.put("expireTime", EXPIRE_TIME);
                    result.put("xh", userForBase2.getGh());
                    result.put("xm", userForBase2.getXm());
                    return result;
                }
            }
        }
        else if(field==3){
            Teacher userForBase3=teacherService.getTeacherInfoByName(String.valueOf(user.get("username")));
            if(userForBase3==null){
                result.put("message","登录失败,该管理员不存在");
                return result;
            }
            else {
                String dbPwd=userForBase3.getMm();
                if (String.valueOf(user.get("password"))==dbPwd){
                    result.put("message","登录失败,该管理员密码错误");
                    return result;
                }else {
                    Date expiresDate = new Date(System.currentTimeMillis()+Integer.valueOf(EXPIRE_TIME)*60*1000);
                    String token = tokenService.getToken(userForBase3,expiresDate);
                    result.put("token", token);
                    result.put("expireTime", EXPIRE_TIME);
                    result.put("xh", userForBase3.getGh());
                    result.put("xm", userForBase3.getXm());
                    return result;
                }
            }
        }
        return result;
    }




}

