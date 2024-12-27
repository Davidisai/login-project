package com.example.loginproject.service;

import com.example.loginproject.model.User;
import com.example.loginproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String registerUser(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setSessionFlag(false);
        userRepository.save(user);
        return "User registered successfully.";
    }

    public String loginUser(String username, String password) {
        Optional<User> userOptional = userRepository.findByUsername(username);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            if (user.getPassword().equals(password)) {
                if (!user.isSessionFlag()) {
                    user.setSessionFlag(true);
                    userRepository.save(user);
                    return "Login successful.";
                } else {
                    return "Error: There is already an active session.";
                }
            }
        }
        return "Error: Invalid username or password.";
    }

    public String logoutUser(String username) {
        Optional<User> userOptional = userRepository.findByUsername(username);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            if (user.isSessionFlag()) {
                user.setSessionFlag(false);
                userRepository.save(user);
                return "Logout successful.";
            }
        }
        return "Error: No active session found.";
    }
}