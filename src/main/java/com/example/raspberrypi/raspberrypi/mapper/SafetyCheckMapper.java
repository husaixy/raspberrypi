package com.example.raspberrypi.raspberrypi.mapper;


import com.example.raspberrypi.raspberrypi.entity.Safety;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SafetyCheckMapper {
    //取safety_long表里的全部数据
    @Select("SELECT id,temperature,insert_time,warning_flag FROM safety_long ")
    List<Safety> trackSafetySystemList();

    @Select("select id,temperature,insert_time,warning_flag from safety_long WHERE (weekday(insert_time)+1) = #{week_date}")//取温度和对应的时间
    List<Safety> trackSafetyWeekList(@Param("week_date") String week_date);

    @Select("SELECT id,temperature,insert_time,warning_flag FROM safety")
    Safety trackSafetySystem();

}
