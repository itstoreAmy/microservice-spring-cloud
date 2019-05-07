package com.emotte.cloud.service.impl;

import com.emotte.cloud.app.user.emerp.mapper.reader.ReEmerpUserMapper;
import com.emotte.cloud.app.user.emerp.mapper.writer.WrEmerpUserMapper;
import com.emotte.cloud.app.user.emerp.model.User;
import com.emotte.cloud.app.user.emotte.mapper.writer.WrUserMapper;
import com.emotte.cloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private WrUserMapper emotteUserMapper;

    @Autowired
    private WrEmerpUserMapper wrEmerpUserMapper;

    @Autowired
    private ReEmerpUserMapper reEmerpUserMapper;

    @Override
    @Transactional
    public int addUser(User user) {
        int a = user.getId();
        int b = 10/a;
        return emotteUserMapper.inserUser(user);
    }

    @Override
    @Transactional
    public int addUser2(User user) {
        int a = user.getId();
        int b = 10/a;
        return wrEmerpUserMapper.inserUser(user);
    }

    @Override
    @Transactional
    public int addUser3(User user) {
        wrEmerpUserMapper.inserUser(user);
        int a = user.getId();
        int b = 10/a;
        emotteUserMapper.inserUser(user);
        return 0;
    }

    @Override
    public User getById(Long id) {
        return reEmerpUserMapper.getById(id);
    }
}
