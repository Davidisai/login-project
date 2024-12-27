package com.example.loginproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private boolean sessionFlag;

    public User() {
    }

    public User(String username, String password, boolean sessionFlag) {
        this.username = username;
        this.password = password;
        this.sessionFlag = sessionFlag;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isSessionFlag() {
        return sessionFlag;
    }

    public void setSessionFlag(boolean sessionFlag) {
        this.sessionFlag = sessionFlag;
    }
}