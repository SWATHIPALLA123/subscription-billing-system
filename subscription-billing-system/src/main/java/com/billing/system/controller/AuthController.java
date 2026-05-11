package com.billing.system.controller;
 
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
 
import java.util.HashMap;
import java.util.Map;
 
@RestController
@RequestMapping("/auth")
public class AuthController {
 
    @PostMapping("/register")
    public ResponseEntity<?> registerUser(
            @RequestBody Map<String, String> request
    ) {
 
        Map<String, Object> response = new HashMap<>();
 
        response.put(
                "message",
                "User Registered Successfully"
        );
 
        response.put(
                "email",
                request.get("email")
        );
 
        return ResponseEntity.ok(response);
    }
 
    @PostMapping("/login")
    public ResponseEntity<?> loginUser(
            @RequestBody Map<String, String> request
    ) {
 
        Map<String, Object> response = new HashMap<>();
 
        response.put(
                "message",
                "Login Successful"
        );
 
        return ResponseEntity.ok(response);
    }
}
 