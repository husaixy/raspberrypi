package com.example.raspberrypi.raspberrypi.controller;


import com.example.raspberrypi.raspberrypi.entity.SafetyCheck;
import com.example.raspberrypi.raspberrypi.entity.User;

import com.example.raspberrypi.raspberrypi.service.SafetyCheckService;
import com.example.raspberrypi.raspberrypi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
@CrossOrigin(originPatterns = "*",allowCredentials = "true")
@RestController//返回json数据给h5
public class BigTrackSafetySystemH5controller {
    @Autowired
    private SafetyCheckService safeCkeckService;

    @RequestMapping(value = "test_html",method = {RequestMethod. POST ,RequestMethod. GET })
    public String TestHtml(){
        return "test";
    }
    @RequestMapping(value = "track_safety_system_current" ,method = {RequestMethod. POST ,RequestMethod. GET })
    public String trackSafetySystemH5(){
        return safeCkeckService.trackSafetySystem();
    }
    @RequestMapping(value = "track_safety_system_list",method ={RequestMethod. POST ,RequestMethod. GET } )
    public List<SafetyCheck> trackSafetySystemListH5(){
        return safeCkeckService.trackSafetySystemList();
    }

}
