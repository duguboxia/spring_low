package com.cn.test;

import com.cn.dao.Animal;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test06 {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new
                ClassPathXmlApplicationContext("beans06.xml");
        Animal animal=(Animal)applicationContext.getBean("animal");
        System.out.println(animal.getType());
        System.out.println(animal.getColor());
        System.out.println(animal.getInfos());
        System.out.println(animal.getMysqlInfos());
        System.out.println(animal.getMembers());//数组打印的是地址
        for (String s:animal.getMembers()
             ) {
            System.out.println(s);
        }
    }
}
