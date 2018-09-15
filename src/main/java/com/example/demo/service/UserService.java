package com.example.demo.service;

import com.example.demo.repository.UserRepositoty;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User业务逻辑
 */
@Service
public class UserService {
    @Autowired
    private UserRepositoty userRepositoty;

    public User findUserByName(String name) {
        User user = null;
        try{
            user = userRepositoty.findByUserName(name);
        }catch (Exception e){
        }
        return user;
    }
}
