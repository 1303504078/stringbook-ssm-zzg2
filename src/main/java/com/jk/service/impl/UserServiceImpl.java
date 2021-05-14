package com.jk.service.impl;

import com.jk.dao.UserDao;
import com.jk.pojo.UserBean;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<UserBean> query() {
        return userDao.query();
    }
}
