package com.cn.test;

import com.cn.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test03 {
    public static void main(String[] args) {
        /*
        BeanFactory与ApplicationContext 最大区别
        前者是延时加载，第一次getBean时才会初始化Bean（执行构造方法）
        后者时及时加载，创建ApplicationContext 后就初始化Bean
        *
        *

        */
        //静态工厂
        ApplicationContext applicationContext=new
                ClassPathXmlApplicationContext("beans.xml");
//        UserService userService=
//                (UserService) applicationContext.getBean("userService1");
//        userService.add();


        //实例工厂
        //1.创建工厂
//        UserServiceFactory1 userServiceFactory1=new UserServiceFactory1();
//        UserService userService=userServiceFactory1.createUserService();
//        userService.add();

        UserService userService=(UserService) applicationContext.getBean("userService2");
        userService.add();
    }
}
