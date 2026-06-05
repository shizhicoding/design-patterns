package com.shizhi.mode.design.pattern.structural.bridge.sender;

import org.springframework.stereotype.Component;

//具体实现：邮箱发送
public class EmailSender implements MessageSender{
    @Override
    public void send(String context) {
        System.out.println("邮件发送"+context);
    }
}
