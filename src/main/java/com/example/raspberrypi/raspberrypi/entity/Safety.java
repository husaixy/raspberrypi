package com.example.raspberrypi.raspberrypi.entity;

public class Safety {
    private String id;
    private String temperature;
    private String insert_time;
    private String warning_flag;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWarning_flag() {
        return warning_flag;
    }
    public void setWarning_flag(String warning_flag) {
        this.warning_flag = warning_flag;
    }
    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getInsert_time() {

        return insert_time;
    }
}
