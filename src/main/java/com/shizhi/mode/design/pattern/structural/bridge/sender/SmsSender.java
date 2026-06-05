package com.shizhi.mode.design.pattern.structural.bridge.sender;

import org.springframework.stereotype.Component;

//具体实现：短信发送
public class SmsSender implements MessageSender{
    @Override
    public void send(String context) {
        System.out.println("短信发送："+context);
    }
}
