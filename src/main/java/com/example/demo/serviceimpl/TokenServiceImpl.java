package com.example.demo.serviceimpl;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.example.demo.pojo.User;
import com.example.demo.service.TokenService;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TokenServiceImpl implements TokenService {
    @Override
    public String getToken(User user, Date date) {
        String token="";

        token= JWT.create()
                .withAudience(String.valueOf(user.getYhid()))
                .withExpiresAt(date) //过期时间配置
                .sign(Algorithm.HMAC256(user.getMm()));
        return token;
    }
}
