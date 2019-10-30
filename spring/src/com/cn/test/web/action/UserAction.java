package com.cn.test.web.action;

import com.cn.dao.User;
import com.cn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class UserAction {
    @Autowired //spring会自动为Service赋值,根据类型来注入（Service类型）
   // @Qualifier("myUserService")//根据指定的id注入属性


    private UserService userService;

    public void save(User user){
        System.out.println("Action save()方法");
        userService.add(user);
    }
}
