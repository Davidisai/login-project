package com.example.loginproject.controller;

import com.example.loginproject.model.User;
import com.example.loginproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody User user) {
        return userService.register(user);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody User user) {
        return userService.login(user);
    }

    @PostMapping("/logout")
    public ResponseEntity<String> logout(@RequestBody User user) {
        return userService.logout(user);
    }
}