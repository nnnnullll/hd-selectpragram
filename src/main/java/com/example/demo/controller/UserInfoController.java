package com.example.demo.controller;
import com.example.demo.CheckToken;
import com.example.demo.PassToken;
import com.example.demo.pojo.User;
import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.token.TokenService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.*;


@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserInfoController {

    @Autowired
    UserInfoService userService;
    @Autowired
    TokenService tokenService;
    @Value("${EXPIRE_TIME}")
    private String EXPIRE_TIME;
    @CheckToken
    @GetMapping("/getUserByName/{userName}")
    public String getUser(@PathVariable("userName") String userName) {
        User userInfoByName = userService.getUserInfoByName(userName);
        return userInfoByName.toString();
    }

    //登录
    @PostMapping("/login")
    public Map<String, Object> login(@RequestBody Map<String,Object> user){
        // System.out.println(user);
        Map result=new HashMap();
        User userForBase=userService.getUserInfoByName(String.valueOf(user.get("username")));
        if(userForBase==null){
            result.put("message","登录失败,用户不存在");
            return result;
        }else {
            BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();
            String dbPwd=userForBase.getMm();
            boolean matchesResult = bCryptPasswordEncoder.matches(String.valueOf(user.get("password")),dbPwd);
            if (!matchesResult){
                result.put("message","登录失败,密码错误");
                return result;
            }else {
                Date expiresDate = new Date(System.currentTimeMillis()+Integer.valueOf(EXPIRE_TIME)*60*1000);
                String token = tokenService.getToken(userForBase,expiresDate);
                result.put("token", token);
                result.put("expireTime", EXPIRE_TIME);
                result.put("yhid", userForBase.getYhid());
                result.put("yhm", userForBase.getYhm());
                return result;
            }
        }
    }
    @CheckToken
    @GetMapping("/afterLogin")
    public String afterLogin(){
        return "你已通过验证,成功进入系统";
    }

    // 注册前验证用户名唯一性
    @GetMapping("/registercheck")
    public String RegisterNameCheck(@RequestParam("yhm") String yhm) {
        try{
            return userService.getUserInfoByName(yhm).toString();
        }catch (Exception e) {
            return "testusername";
        }   
    }

    // 注册前验证邮箱唯一性
    @GetMapping("/registeryxcheck")
    public String RegisterYxCheck(@RequestParam("yx") String yx) {
        List<User> a=userService.getUserInfoByYx(yx);
        if(a.isEmpty() ){
            return "testmail";
        }
        else{
            return userService.getUserInfoByYx(yx).toString();
        }
    }

}

