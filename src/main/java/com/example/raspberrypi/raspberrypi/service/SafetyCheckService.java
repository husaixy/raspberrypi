package com.example.raspberrypi.raspberrypi.service;


import com.example.raspberrypi.raspberrypi.entity.Safety;
import com.example.raspberrypi.raspberrypi.mapper.SafetyCheckMapper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SafetyCheckService {
    @Autowired
    private SafetyCheckMapper safetyCheckMapper;
    public List<Safety> SafetytimeList(String aweek){
        List<Safety> list=null;

        list =safetyCheckMapper.trackSafetyTimeList(aweek);
        if (list ==null){
            list =new ArrayList<Safety>();
            System.out.println("没有从数据库获取到数据....");
        }else {
            System.out.println("成功从数据库获取数据");
        }
        return list;
    }


    public List<Safety> trackSafetySystemList(){
        List<Safety> list=null;
        System.out.println("trackSafetySystemList():"+list);
        list =safetyCheckMapper.trackSafetySystemList();

        System.out.println("trackSafetySystemList():"+list);
        System.out.println("List:"+list);
        if (list ==null){
            list =new ArrayList<Safety>();
            System.out.println("没有从数据库获取到数据....");
        }else {
            System.out.println("成功从数据库获取数据");
        }
        return list;
    }
    private final Log log = LogFactory.getLog(SafetyCheckService.class);
    public Safety trackSafetySystem() {
        Safety safety;
        safety =safetyCheckMapper.trackSafetySystem();
        return safety;
    }
}
