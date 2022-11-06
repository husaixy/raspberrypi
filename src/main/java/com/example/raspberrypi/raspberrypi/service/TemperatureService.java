package com.example.raspberrypi.raspberrypi.service;

import com.example.raspberrypi.raspberrypi.entity.Temperature;
import com.example.raspberrypi.raspberrypi.mapper.TemperatureMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemperatureService {
    private final TemperatureMapper temperatureMapper;

    public TemperatureService(TemperatureMapper temperatureMapper) {
        this.temperatureMapper = temperatureMapper;
    }

    public Temperature getTemperatureByUser(String phone){
        Temperature temperature = null;
        temperature = temperatureMapper.getTemperatureByUser(phone);
        return temperature;
    }

    public List <Temperature> getTemperatureListByUser(String phone){
        List <Temperature> list = null;
        list = temperatureMapper.getTemperatureListByUser(phone);
        return list;
    }

    public List <Temperature> getTemperatureListByTimeAndUser(String date, String phone){
        List <Temperature> list = null;
        list = temperatureMapper.getTemperatureListByTimeAndUser(date,phone);
        return list;
    }
}
