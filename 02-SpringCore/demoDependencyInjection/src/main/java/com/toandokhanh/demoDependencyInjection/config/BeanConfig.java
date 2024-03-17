package com.toandokhanh.demoDependencyInjection.config;

import com.toandokhanh.demoDependencyInjection.Model.Demo;
import com.toandokhanh.demoDependencyInjection.useDemo;
import com.toandokhanh.demoDependencyInjection.useDemo2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean("2")
    public Demo useDemo2(){
        return new useDemo2();
    }

    @Bean("1")
    public Demo useDemo(){
        return new useDemo();
    }
}
