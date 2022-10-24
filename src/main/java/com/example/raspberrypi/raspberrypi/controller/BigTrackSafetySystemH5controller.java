package com.example.raspberrypi.raspberrypi.controller;


import com.example.raspberrypi.raspberrypi.entity.Safety;

import com.example.raspberrypi.raspberrypi.service.SafetyCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
//成功提交
@CrossOrigin(originPatterns = "*",allowCredentials = "true")
@RestController//返回json数据给h5
public class BigTrackSafetySystemH5controller {
    @Autowired
    private SafetyCheckService safeCkeckService;
    //测试云服务器是否部署
    @RequestMapping(value = "test_html",method = {RequestMethod. POST ,RequestMethod. GET })
    public String TestHtml(){
        return "test";
    }
    //根据周几返回对应天的全部数据，前端参数名为week，若不一致请修改
    @RequestMapping(value = "track_safety_week_list" ,method = {RequestMethod. POST ,RequestMethod. GET })
    public List <Safety> trackSafetyWeekH5(HttpServletRequest request){
        String week=request.getParameter("week");
        return safeCkeckService.SafetyweekList(week);
    }
    //返回一个safety对象
    @RequestMapping(value = "track_safety_system_current" ,method = {RequestMethod. POST ,RequestMethod. GET })
    public Safety trackSafetySystemH5(){
        return safeCkeckService.trackSafetySystem();
    }
    //获取safety_long表里的全部数据返回一个list<Safety>
    @RequestMapping(value = "track_safety_system_list",method ={RequestMethod. POST ,RequestMethod. GET } )
    public List<Safety> trackSafetySystemListH5(){
        return safeCkeckService.trackSafetySystemList();
    }

}
