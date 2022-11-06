package com.example.raspberrypi.raspberrypi.controller;

import com.example.raspberrypi.raspberrypi.entity.Temperature;
import com.example.raspberrypi.raspberrypi.service.TemperatureService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/temperature")
public class TemperatureController {

    private final TemperatureService temperatureService;

    public TemperatureController(TemperatureService temperatureService) {
        this.temperatureService = temperatureService;
    }

    /**
     *
     * @param phone 电话号
     * @return 温度对象
     */
    @RequestMapping(value = "/temperature_by_user")
    public Temperature getTemperatureByUser(String phone){
        Temperature temperature = null;
        temperature = temperatureService.getTemperatureByUser(phone);
        return temperature;
    }

    /**
     *
     * @param phone 电话号码
     * @return  list温度
     */
    @RequestMapping(value = "/temperature_list_by_user")
    public List<Temperature> getTemperatureListByUser(String phone){
        List<Temperature> list = null;
        list = temperatureService.getTemperatureListByUser(phone);
        return list;
    }

    /**
     *
     * @param date  时间 (yyyy-mm-dd)
     * @param phone 电话号码
     * @return  list温度
     */
    @RequestMapping(value = "/temperature_list_by_time_user")
    public List<Temperature> getTemperatureListByTimeAndUser(String date,String phone){
        List<Temperature> list = null;
        list = temperatureService.getTemperatureListByTimeAndUser(date,phone);
        return list;
    }
}
