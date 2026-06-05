package com.shizhi.mode.design.pattern.structural.bridge;

import com.shizhi.mode.design.pattern.structural.bridge.message.Message;
import com.shizhi.mode.design.pattern.structural.bridge.message.UrgentMessage;
import com.shizhi.mode.design.pattern.structural.bridge.sender.EmailSender;
import com.shizhi.mode.design.pattern.structural.bridge.sender.SmsSender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BridgeTest {

    @Test
    public void test(){
        Message mess=new UrgentMessage(new SmsSender());
        mess.sendMessage("hhh");
    }
}
