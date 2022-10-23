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
    @Select("SELECT temperature,insert_time FROM safety_long LIMIT 0,20")//取温度和对应的时间
    List<Safety> trackSafetySystemList();
    
    @Select("select temperature,insert_time,warning_flag from safety_long WHERE (weekday(insert_time)+1) = #{week_date}")//取温度和对应的时间
    List<Safety> trackSafetyWeekList(@Param("week_date") String week_date);

    @Select("SELECT temperature,insert_time,warning_flag FROM safety")
    Safety trackSafetySystem();

}
