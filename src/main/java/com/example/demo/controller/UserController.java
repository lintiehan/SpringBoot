package com.example.demo.controller;

import com.example.demo.repository.UserRepositoty;
import com.example.demo.service.UserService;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserRepositoty userRepositoty;

    /**
     * 查询用户列表方法
     * @return
     */
    @GetMapping(value = "/list")
    public List<User> list(){
        return userRepositoty.findAll();
    }

    /**
     * 添加，更新用户方法
     * @param user
     * @return
     */
    @GetMapping(value = "/save")
    public User save(User user){
        return userRepositoty.save(user);
    }
    @GetMapping(value = "/delete")
    public List<User> delete(Long id){
        userRepositoty.deleteById(id);
        return userRepositoty.findAll();
    }
}
