package com.cn.service;

import com.cn.dao.IUserDao;
import com.cn.dao.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceimp implements UserService {

    @Autowired//spring 会自动往userDao赋值
    private IUserDao userDao;
    private  String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void add() {
        System.out.println("创建一个新用户，，，"+name);
    }

    @Override
    public void add(User user) {
        System.out.println("service添加用户"+user);
        //调用dao
        userDao.add(user);
    }

    public UserServiceimp(){}
}
