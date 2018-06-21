package com.inno.dao;

import com.inno.model.User;

/**
 * Created by 22796 on 2018/6/13.
 */
public interface UserDao {

    User selectUser(long id);
}
