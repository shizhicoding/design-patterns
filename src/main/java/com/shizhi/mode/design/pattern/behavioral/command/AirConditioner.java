package com.shizhi.mode.design.pattern.behavioral.command;


import org.springframework.stereotype.Component;

//接收者：空调
@Component
public class AirConditioner {
    public void on(){
        System.out.println("空调开启");
    }
}
