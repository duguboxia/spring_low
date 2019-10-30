package com.cn.test;

import com.cn.dao.User;
import com.cn.test.web.action.UserAction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationTargetException;

public class Test_1 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ApplicationContext applicationContext=new
                ClassPathXmlApplicationContext("bean_test.xml");
        //获取Action的user值
        UserAction userAction=  applicationContext.getBean(UserAction.class);
        User u=new User("王维娜","123456");
        userAction.save(u);

        //关闭容器(实现dao中的销毁方法)
        applicationContext.getClass().getMethod("close").invoke(applicationContext);
    }
}
