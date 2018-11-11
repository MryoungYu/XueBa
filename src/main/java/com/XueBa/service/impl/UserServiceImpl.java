package com.XueBa.service.impl;

import com.XueBa.dao.IUserDao;
import com.XueBa.model.User;
import com.XueBa.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    public User selectUser(long id) {
        return this.userDao.selectUser(id);
    }
}
