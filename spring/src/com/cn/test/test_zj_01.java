package com.cn.test;

import com.cn.dao.User;
import com.cn.test.web.action.UserAction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test_zj_01 {
    public static void main(String[] args) {
        //注解的使用
        /*
        web开发流程action->service ->dao
        *
        *
        *
        ApplicationContext applicationContext=new
                ClassPathXmlApplicationContext("bean_zj_01.xml");
        //拿到service
      UserService userService=(UserService) applicationContext.getBean("userService");
        User user=new User("张三","123456");
        userService.add(user);
        */



        //拿Action
        ApplicationContext applicationContext=new
                ClassPathXmlApplicationContext("bean_zj_01.xml");
        UserAction userAction =(UserAction)applicationContext.getBean("userAction");
        User user=new User("王五","123456");
        userAction.save(user);










    }
}
