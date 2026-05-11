package com.billing.system.service.impl;
 
import com.billing.system.security.JwtUtil;
import com.billing.system.service.AuthService;
 
import org.springframework.stereotype.Service;
 
@Service
public class AuthServiceImpl
        implements AuthService {
 
    private JwtUtil jwtUtil = new JwtUtil();
 
    @Override
    public String login(String username) {
 
        return jwtUtil.generateToken(username);
    }
}
 