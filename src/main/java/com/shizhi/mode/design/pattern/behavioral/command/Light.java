package com.shizhi.mode.design.pattern.behavioral.command;


import org.springframework.stereotype.Component;

//接收者：灯
@Component
public class Light {
    public void on(){
        System.out.println("点灯开启");
    }
}
