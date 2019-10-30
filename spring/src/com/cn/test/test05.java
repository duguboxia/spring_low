package com.cn.test;

import com.cn.dao.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test05 {
    public static void main(String[] args) {

        ApplicationContext applicationContext=new
                ClassPathXmlApplicationContext("beans05.xml");
        Student student=(Student) applicationContext.getBean("student");
        System.out.println(student);


    }
}
