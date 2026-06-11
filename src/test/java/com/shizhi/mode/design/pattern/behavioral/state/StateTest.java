package com.shizhi.mode.design.pattern.behavioral.state;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StateTest {
    @Test
    public void test(){
        MobileConnection mobileConnection=new MobileConnection();
        mobileConnection.connect();
        mobileConnection.showStatus();
        mobileConnection.sendData("111");
        mobileConnection.disconnect();
        mobileConnection.sendData("111");
        mobileConnection.showStatus();
    }
}
