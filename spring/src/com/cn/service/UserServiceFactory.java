package com.cn.service;

public class UserServiceFactory {
    public  static UserService createUserService(){
        return new UserServiceimp();
    }
}
