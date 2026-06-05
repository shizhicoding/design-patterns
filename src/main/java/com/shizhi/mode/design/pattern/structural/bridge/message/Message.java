package com.shizhi.mode.design.pattern.structural.bridge.message;

import com.shizhi.mode.design.pattern.structural.bridge.sender.MessageSender;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public abstract class Message {
    protected MessageSender sender;

    public Message(MessageSender sender) {
        this.sender = sender;
    }

    public abstract void sendMessage(String body);
}
