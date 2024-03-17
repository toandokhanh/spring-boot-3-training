package com.toandokhanh.demoDependencyInjection;


import com.toandokhanh.demoDependencyInjection.Model.Demo;
import org.springframework.stereotype.Component;

public class useDemo implements Demo {

    @Override
    public String message() {
        return "Tôi là một Java dev lương 20.000.000 VND";
    }
}
