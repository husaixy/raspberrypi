package com.example.raspberrypi.raspberrypi.entity;

public class SafetyCheck {
    private String temperature;
    private String insert_time;

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getInsert_time() {

        return insert_time;
    }

    public void setInsert_time(String insert_time) {
//        insert_time,,,2022-10-16 00:09:51
        insert_time.split(" ");
//        insert_time.re
        this.insert_time = insert_time;
    }
}
