package com.example.demo.controller;
import com.example.demo.CheckToken;
import com.example.demo.pojo.Controller;
import com.example.demo.pojo.Student;
import com.example.demo.pojo.Teacher;
import com.example.demo.service.*;
import io.swagger.models.auth.In;
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
    TitleService titleService;
    @Autowired
    StudentService studentService;
    @Autowired
    TeacherService teacherService;
    @Autowired
    ControllerService controllerService;
    @Autowired
    TokenService tokenService;
    @Value("${EXPIRE_TIME}")
    private String EXPIRE_TIME;

    @PostMapping("/match")
    public void match(@RequestBody Map user){
       // Map result=new HashMap();
        Integer glyh=Integer.parseInt(String.valueOf(user.get("glyh")));
        Controller controller=controllerService.getControllerInfoById(glyh);
        if(controller!=null){
            titleService.matchUnselected();
        }
        //return result;
    }

    //重置账户密码为学号/工号/管理员号
    @PostMapping("/reset")
    public void reset(@RequestBody Map<String,Object> user){
        Integer field=Integer.parseInt(String.valueOf(user.get("kind")));
        System.out.println("类别："+field);
        String mm=String.valueOf(user.get("password"));
        if(field==1) {
            Integer xh=Integer.parseInt(String.valueOf(user.get("username")));
            studentService.resetpwd(xh,mm);
        }
        else if(field==2){
            Integer gh=Integer.parseInt(String.valueOf(user.get("username")));
            teacherService.resetpwd(gh,mm);
        }
        else if(field==3){
            Integer glyh=Integer.parseInt(String.valueOf(user.get("username")));
            controllerService.resetPwd(glyh,mm);
        }
    }

    @PostMapping("/getStuById")
    public Map getStuById(@RequestBody Map user){
        Map result=new HashMap();
        Integer xh=Integer.parseInt(String.valueOf(user.get("xh")));
        result.put("res",studentService.getStudentInfoById(xh));
        return result;
    }

    @PostMapping("/getTeacherById")
    public Map getTeacherById(@RequestBody Map user){
        Map result=new HashMap();
        Integer gh=Integer.parseInt(String.valueOf(user.get("gh")));
        result.put("res",teacherService.getTeacherInfoById(gh));
        return result;
    }

    @PostMapping("/getTeacherByName")
    public Map getTeacherByName(@RequestBody Map user){
        Map result=new HashMap();
        String xm=(String.valueOf(user.get("xm")));
        result.put("res",teacherService.getTeacherInfoByName(xm));
        return result;
    }

    //修改更新用户名、邮箱等信息
    @PostMapping("/renewstu")
    public String renew(@RequestBody Map user) {
        try{
            Integer xh=Integer.parseInt(String.valueOf(user.get("xh")));
            Integer yxh=Integer.parseInt(String.valueOf(user.get("yxh")));
            String xm=String.valueOf(user.get("xm"));
            String mm=String.valueOf(user.get("mm"));
            String zy=String.valueOf(user.get("zy"));
            String nj=String.valueOf(user.get("nj"));
            String xb=String.valueOf(user.get("xb"));
            String yx=String.valueOf(user.get("yx"));
            String qq=String.valueOf(user.get("qq"));
            String sjh=String.valueOf(user.get("sjh"));
            String zwjs=String.valueOf(user.get("zwjs"));
            return studentService.renewStudentInfo(xh,xm,mm,yxh,zy,nj,xb,yx,qq,sjh,zwjs);
        }
        catch (Exception e){
            System.out.println(e);
            return "fail";
        }
    }

    //修改更新用户名、邮箱等信息
    @PostMapping("/renewTeacher")
    public String renewTeacher(@RequestBody Map user) {
        try{
            Integer xh=Integer.parseInt(String.valueOf(user.get("gh")));
            Integer yxh=Integer.parseInt(String.valueOf(user.get("yxh")));
            String xm=String.valueOf(user.get("xm"));
            String mm=String.valueOf(user.get("mm"));
            String xl=String.valueOf(user.get("xl"));
            String zc=String.valueOf(user.get("zc"));
            String xb=String.valueOf(user.get("xb"));
            String yx=String.valueOf(user.get("yx"));
            String qq=String.valueOf(user.get("qq"));
            String sjh=String.valueOf(user.get("sjh"));
            String zwjs=String.valueOf(user.get("zwjs"));
            String jglb=String.valueOf(user.get("jglb"));
            String szyjs=String.valueOf(user.get("szyjs"));
            String bgsdh=String.valueOf(user.get("bgsdh"));
            String bgsdz=String.valueOf(user.get("bgsdz"));
            teacherService.renewTeacherInfo(xh,xm,mm,yxh,xl,zc,xb,yx,qq,sjh,zwjs,jglb,szyjs,bgsdh,bgsdz);
            return "success";
        }
        catch (Exception e){
            System.out.println(e);
            return "fail";
        }
    }

    //登录
    @PostMapping("/login")
    public Map<String, Object> login(@RequestBody Map<String,Object> user){
        Map result=new HashMap();
        Integer field=Integer.parseInt(String.valueOf(user.get("kind")));
        System.out.println("类别："+field);
        if(field==1) {
            Student userForBase=studentService.getStudentInfoById(Integer.parseInt(String.valueOf(user.get("username"))));
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
                    result.put("yxh", userForBase.getYxh());
                    return result;
                }
            }
        }
        else if(field==2){
            Teacher userForBase2=teacherService.getTeacherInfoById(Integer.parseInt(String.valueOf(user.get("username"))));
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
                    result.put("gh", userForBase2.getGh());
                    result.put("xm", userForBase2.getXm());
                    result.put("yxh", userForBase2.getYxh());
                    return result;
                }
            }
        }
        else if(field==3){
            Controller userForBase3=controllerService.getControllerInfoById(Integer.parseInt(String.valueOf(user.get("username"))));
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
                    result.put("glyh", userForBase3.getGlyh());
                    result.put("xm", userForBase3.getXm());
                    return result;
                }
            }
        }
        return result;
    }




}

