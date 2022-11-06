package com.example.raspberrypi.raspberrypi.mapper;

import com.example.raspberrypi.raspberrypi.entity.Temperature;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TemperatureMapper {

    @Select("SELECT id,temperature,insert_time,warning_flag FROM safety_long where phone = #{phone}")
    List<Temperature> getTemperatureListByUser(@Param("phone") String phone);

    @Select("select id,temperature,insert_time,warning_flag from safety_long WHERE insert_time like concat(#{date},'%') and phone = #{phone}")
    List<Temperature> getTemperatureListByTimeAndUser(@Param("date") String week_date, @Param("phone") String phone);

    @Select("SELECT id,temperature,insert_time,warning_flag FROM safety where phone = #{phone}")
    Temperature getTemperatureByUser(@Param("phone") String phone);

}
