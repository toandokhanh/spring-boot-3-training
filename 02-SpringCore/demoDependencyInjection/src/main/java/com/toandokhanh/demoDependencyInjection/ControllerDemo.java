package com.toandokhanh.demoDependencyInjection;

import com.toandokhanh.demoDependencyInjection.Model.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerDemo {

//    @Autowired // field injection
    private Demo demo;

@Autowired // constructor injection
    public ControllerDemo(@Qualifier("2") Demo demo) {
        this.demo = demo;
    }

//    @Autowired // setter injection
//    public void setDemo(useDemo demo) {
//        this.demo = demo;
//    }

    @GetMapping("/dailyworkout")
    public String Dailyworkout(){
        return demo.message();
    }



}
