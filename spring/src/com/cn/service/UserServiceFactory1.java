package com.cn.service;

public class UserServiceFactory1 {
    public  UserService createUserService(){
        return new UserServiceimp();
    }
}
