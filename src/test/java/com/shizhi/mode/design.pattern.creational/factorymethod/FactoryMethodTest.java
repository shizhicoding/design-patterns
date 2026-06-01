package com.shizhi.mode.design.pattern.creational.factorymethod;


import com.shizhi.mode.design.pattern.creational.factorymethod.factory.PaymentRouter;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
public class FactoryMethodTest {
    @Autowired
    private PaymentRouter paymentRouter;

    @Test
    public void Test(){
        PaymentService paymentService= paymentRouter.get("wechat");
        paymentService.pay(BigDecimal.valueOf(100));
    }

}
