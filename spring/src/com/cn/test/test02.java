package com.cn.test;

public class test02 {
    public static void main(String[] args) {
        //spring容器加载有3种方式

        //第一种：ClassPathXmlApplicationContext classPath类路径加载，指的就是classes路径（相对路径）

        /*ApplicationContext applicationContext=new
                ClassPathXmlApplicationContext("beans.xml");
        UserService userService=(UserService)applicationContext.getBean("userService");
        userService.add();*/

        //第二种：文件系统路径获得配置文件（绝对路径）

       /* ApplicationContext applicationContext=new
                FileSystemXmlApplicationContext("E:\\Java_Project\\spring\\src\\beans.xml");
        UserService userService=(UserService)
                applicationContext.getBean("userService");
        userService.add();*/

       //第三种：使用BeanFactory
        /*String path = "E:\\Java_Project\\spring\\src\\beans.xml";
        BeanFactory beanFactory=new XmlBeanFactory(new FileSystemResource(path));
        UserService userService= (UserService) beanFactory.getBean("userService");
        userService.add();
*/

    }
}
