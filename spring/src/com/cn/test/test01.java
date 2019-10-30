package com.cn.test;

import com.cn.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class test01 {
    //以前用service方式，自己创建文件
    public static void main(String[] args) {
       /* UserService userService=new UserServiceimp();
        userService.add();*/
       //现在用Userservice方式从spring容器获取
        //1.加载beas.xml这个内部配置文件，内部就会创建对象

        ApplicationContext applicationContext=new
                ClassPathXmlApplicationContext("beans.xml");
        //2.从容器spring中获取UserService对象
        UserService userService= (UserService) applicationContext.getBean("userService");
        userService.add();
    }
}
