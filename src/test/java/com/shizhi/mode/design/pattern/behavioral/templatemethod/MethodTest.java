package com.shizhi.mode.design.pattern.behavioral.templatemethod;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MethodTest {

    @Test
    public void test(){
        NotificationSender sender1=new EmailNotification();
        NotificationSender sender2=new SmsNotification();
        sender1.send("user@example.com", "账户激活通知");
        System.out.println("-----------");
        sender2.send("13812345678", "您的验证码是123456");

    }
}
