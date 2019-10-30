package com.cn.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test04 {
    public static void main(String[] args) {

        ApplicationContext applicationContext=new
                ClassPathXmlApplicationContext("beans1.xml");
        //从容器中获取两个bean
//        UserService userService1=(UserService)applicationContext.getBean("userService");
//        UserService userService2=(UserService)applicationContext.getBean("userService");
//        System.out.println(userService1);
//        System.out.println(userService2);

//        User user= (User) applicationContext.getBean("user");
//        List<String> stringList=user.getAddresslist();
//        for (String stringlist1: stringList
//             ) {
//            System.out.println(stringlist1);
//        }





    }
}
