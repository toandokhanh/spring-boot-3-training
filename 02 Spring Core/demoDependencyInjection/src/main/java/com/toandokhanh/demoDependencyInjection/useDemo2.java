package com.toandokhanh.demoDependencyInjection;

import com.toandokhanh.demoDependencyInjection.Model.Demo;
import org.springframework.stereotype.Component;

public class useDemo2 implements Demo {

    @Override
    public String message() {
        return "Tôi là Java Junior lương 1200$";
    }
}
