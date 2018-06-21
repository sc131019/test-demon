package com.inno.controller;

import com.inno.business.UserManage;
import com.inno.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by 22796 on 2018/6/13.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserManage userManage;

    @RequestMapping(value = "/query/by/id")
    public Object selectUser(long id){
        return userManage.selectUser(id);
    }
}
