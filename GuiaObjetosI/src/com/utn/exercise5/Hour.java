package com.utn.exercise5;

public class Hour {

    private int hour;
    private int minit;
    private int second;

    public Hour(int hour, int minit, int second) {
        this.hour = (hour >= 0 && hour < 24) ? hour : 0;
        this.minit = (minit >= 0 && minit < 60) ? minit : 0;
        this.second = (second >= 0 && second < 60) ? second : 0;
    }



    public void incrementHour() {
        if(this.hour == 23) {
            this.hour = 0;
        } else {
            this.hour++;
        }
    }

    public void incrementMinit() {
        if(this.minit == 59) {
            this.minit = 0;
            incrementHour();
        } else {
            this.minit++;
        }
    }

    public Hour incrementSecond() {
        if(this.second == 59) {
            this.second = 0;
            incrementMinit();
        } else {
            this.second++;
        }
        return this;
    }

    public void decrementHour() {
        if(this.hour == 0) {
            this.hour = 23;
        } else {
            this.hour--;
        }
    }

    public void decrementMinit() {
        if(this.minit == 0) {
            this.minit = 59;
            decrementHour();
        } else {
            this.minit--;
        }
    }

    public Hour decrementSecond() {
        if(this.second == 0) {
            this.second = 59;
            decrementMinit();
        } else {
            this.second--;
        }
        return this;
    }

    public String getHour() {
        String hh = String.format("%02d", this.hour);
        String mm = String.format("%02d", this.minit);
        String ss = String.format("%02d", this.second);

        return hh + " : " + mm + " : " + ss;
    }

}
