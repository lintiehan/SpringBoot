package com.example.demo.controller;


import com.example.demo.entity.User;
import com.example.demo.repository.UserRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/user")
public class LoginController {

    @Autowired
    private UserRepositoty userRepositoty;

    @RequestMapping(value = "/login")
    public String login(User user, HttpServletRequest request) {
        String result = "登录成功";
        boolean flag=true;
        //根据用户名查询用户是否存在
        User userEntity = userRepositoty.findByUserName(user.getName());
        if (userEntity == null) {
            flag=false;
            result = "用户不存在，登录失败";
        }else if (!userEntity.getPassword().equals(user.getPassword())){
            flag=false;
            result = "用户密码不相符，登录失败";
        }
        if(flag){
            request.getSession().setAttribute("seeeion_user",user);
        }
        return result;
    }
}
