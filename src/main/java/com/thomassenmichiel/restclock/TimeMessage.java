package com.thomassenmichiel.restclock;

public class TimeMessage {
    private String time;

    public TimeMessage() {
    }

    public TimeMessage(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
