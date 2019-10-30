package com.cn.test;

import com.cn.dao.User;
import com.cn.test.web.action.UserAction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test_zj_02 {
    public static void main(String[] args) {
        //注解的使用
        /*
        web开发流程action->service ->dao



        *
        *
        *
        ApplicationContext applicationContext=new
                ClassPathXmlApplicationContext("bean_zj_01.xml");
       */
       ApplicationContext applicationContext=new
               ClassPathXmlApplicationContext("bean_zj_02.xml");
        //获取Action的user值
        UserAction userAction= applicationContext.getBean(UserAction.class);
        User u=new User("王维娜","123456");
        userAction.save(u);








    }
}
