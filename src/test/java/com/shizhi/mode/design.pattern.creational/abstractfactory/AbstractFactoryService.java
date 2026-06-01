package com.shizhi.mode.design.pattern.creational.abstractfactory;


import com.shizhi.mode.design.pattern.creational.abstractfactory.factory.PayChannelSelector;
import com.shizhi.mode.design.pattern.creational.abstractfactory.factory.PayFactory;
import com.shizhi.mode.design.pattern.creational.abstractfactory.pay.method.Payment;
import com.shizhi.mode.design.pattern.creational.abstractfactory.pay.method.Refund;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
public class AbstractFactoryService {

    @Autowired
    private PayChannelSelector payChannelSelector;

    @Test
    public void payTest(){
        PayFactory ali = payChannelSelector.get("ali");
        Refund refund = ali.getRefund();
        refund.refund(BigDecimal.valueOf(100));
        Payment payment = ali.getPayment();
        payment.pay(BigDecimal.valueOf(100));

        System.out.println("------------------");

        PayFactory wx = payChannelSelector.get("wx");
        refund = wx.getRefund();
        refund.refund(BigDecimal.valueOf(100));
        payment = wx.getPayment();
        payment.pay(BigDecimal.valueOf(100));
    }
}
