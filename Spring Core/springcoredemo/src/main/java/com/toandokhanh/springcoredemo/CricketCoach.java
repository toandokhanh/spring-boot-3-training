package com.toandokhanh.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "I program more than 180 minutes a day";
    }
}
