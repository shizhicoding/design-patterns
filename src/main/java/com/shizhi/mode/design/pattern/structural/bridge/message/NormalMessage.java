package com.shizhi.mode.design.pattern.structural.bridge.message;

import com.shizhi.mode.design.pattern.structural.bridge.sender.MessageSender;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//加急消息
public class NormalMessage extends Message{

    public NormalMessage(MessageSender sender) {
        super(sender);
    }

    @Override
    public void sendMessage(String body) {
        String mess="急急急:"+body;
        sender.send(mess);
    }
}
