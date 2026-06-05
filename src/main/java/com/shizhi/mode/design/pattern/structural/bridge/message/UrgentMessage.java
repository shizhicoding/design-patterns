package com.shizhi.mode.design.pattern.structural.bridge.message;

import com.shizhi.mode.design.pattern.structural.bridge.sender.MessageSender;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//细化抽象：普通消息
public class UrgentMessage extends Message{
    public UrgentMessage(MessageSender sender) {
        super(sender);
    }

    @Override
    public void sendMessage(String body) {
        sender.send("普通消息"+body);
    }
}
