package com.cn.dao;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository
public class UserDaoImp implements IUserDao {

    @Override
    public void add(User user) {
        System.out.println("UserDao添加"+user);
    }


    @PostConstruct
    public void init(){
        System.out.println("自定义的初始方法，，，，，，");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("自定义销毁方法，，，，，");
    }
}
