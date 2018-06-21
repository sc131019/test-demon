package com.inno.business.impl;

import com.inno.business.UserManage;
import com.inno.dao.UserDao;
import com.inno.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by 22796 on 2018/6/13.
 */
@Service
public class StudentManageImpl implements UserManage{

    @Resource
    private UserDao userDao;

    public User selectUser(long userId) {
        return userDao.selectUser(userId);
    }
}
