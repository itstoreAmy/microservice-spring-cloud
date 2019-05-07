package com.emotte.cloud.controller;

import com.emotte.cloud.app.user.emerp.mapper.reader.ReEmerpUserMapper;
import com.emotte.cloud.app.user.emerp.model.User;
import com.emotte.cloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private ReEmerpUserMapper userMapper;

    @Autowired
    private UserService userService;

    @GetMapping("/simple/{id}")
    public User findById(@PathVariable Long id) {
        return this.userService.getById(id);
    }

    @RequestMapping("/insert")
    public int addUser(User user) {
        int result = userService.addUser(user);
        return result;
    }

    @RequestMapping("/insert2")
    public int addUser2(User user) {
        int result = userService.addUser2(user);
        return result;
    }

    @RequestMapping("/insert3")
    public int addUser3(User user) {
        int result = userService.addUser3(user);
        return result;
    }





}
