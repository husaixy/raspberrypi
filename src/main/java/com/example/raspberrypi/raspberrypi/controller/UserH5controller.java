package com.example.raspberrypi.raspberrypi.controller;

import com.example.raspberrypi.raspberrypi.entity.User;
import com.example.raspberrypi.raspberrypi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@CrossOrigin(originPatterns = "*",allowCredentials = "true")
@RestController//返回json数据给h5
public class UserH5controller {
    @Autowired
    private UserService userService;
    //user表中插入数据,只需要username和password就可以了，id自动递增
    @RequestMapping(value = "user_add",method = {RequestMethod. POST ,RequestMethod. GET })
    public boolean userverifyadd(User user, HttpServletRequest request){
        user.setId(String.valueOf(userService.idcount()+1));
            return userService.adduser(user);
    }
    //删除，传个username
    @RequestMapping(value = "user_del",method = {RequestMethod. POST ,RequestMethod. GET })
    public  boolean userverifydel(User user, HttpServletRequest request){
        System.out.println(user.getUsername());
        return  userService.deluser(user.getUsername());
    }
    @RequestMapping(value = "check_login",method = {RequestMethod. POST ,RequestMethod. GET })
    public User Check_LoginH5(HttpServletRequest request){
        User user=new User();
        String username=request.getParameter("username");
        String password=request.getParameter("password");

        if (userService.findByName(username,password)==null){
            System.out.println("test");
            return null;
        }
        else
            return userService.findByName(username,password);
    }

}
