package com.example.demo.serviceimpl;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.example.demo.pojo.Student;
import com.example.demo.pojo.Teacher;
import com.example.demo.service.TokenService;
import org.springframework.stereotype.Service;


import java.util.Date;

@Service
public class TokenServiceimpl implements TokenService {

    @Override
    public String getToken(Student user, Date date) {
        String token="";

        token= JWT.create()
                .withAudience(String.valueOf(user.getXh()))
                .withExpiresAt(date) //过期时间配置
                .sign(Algorithm.HMAC256(user.getMm()));
        return token;
    }
    @Override
    public String getToken(Teacher user, Date date) {
        String token="";

        token= JWT.create()
                .withAudience(String.valueOf(user.getGh()))
                .withExpiresAt(date) //过期时间配置
                .sign(Algorithm.HMAC256(user.getMm()));
        return token;
    }

}
