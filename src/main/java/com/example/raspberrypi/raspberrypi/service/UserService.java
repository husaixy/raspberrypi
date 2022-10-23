package com.example.raspberrypi.raspberrypi.service;

import com.example.raspberrypi.raspberrypi.entity.User;
import com.example.raspberrypi.raspberrypi.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public User findByName(String name, String pwd)
    {
        System.out.println("service");
        return (User) userMapper.queryuser(name,pwd);
    }
    public int idcount(){
        return userMapper.countid();
    }
    public boolean adduser(User user){
       return userMapper.adduser(user);
    }
    public Boolean deluser(String name){
        return userMapper.deleteuser(name);
    }
}
