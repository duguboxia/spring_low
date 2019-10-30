package com.cn.test;

import com.cn.dao.User;
import com.cn.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test_zj {
    /*
    *
    * 注解取代xml中得bean配置
    *
    * spring默认情况下注解不生效，需开启注解功能
    * 如何开启？
    * 在xml配置下面写两行代码：
    *   xmlns:context="http://www.springframework.org/schema/context"
    *  xsi:schemaLocation="
    *   http://www.springframework.org/schema/context
                           https://www.springframework.org/schema/context/spring-context.xsd"
    *
    * */
    public static void main(String[] args) {
        ApplicationContext applicationContext=new
                ClassPathXmlApplicationContext("bean_zj.xml");

        //如果@Component没配置id，通过类型获取
        //类型可以说接口也可以是实现类
        //Student student=(Student)applicationContext.getBean(Student.class);

        //如果@Component配置id，就可以通过id获取
        UserService userService=(UserService) applicationContext.getBean("userservice");
        User u=new User ("吴军如","123456");
        userService.add(u);
    }

}
