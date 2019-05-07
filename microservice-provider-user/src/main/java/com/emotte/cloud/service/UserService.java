package com.emotte.cloud.service;

import com.emotte.cloud.app.user.emerp.model.User;

public interface UserService {


    public int addUser(User user);

    public int addUser2(User user);

    public int addUser3(User user);

    User getById(Long id);
}
