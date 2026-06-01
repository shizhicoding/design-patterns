package com.shizhi.mode.design.pattern.creational.abstractfactory.pay.api.ali;


import com.shizhi.mode.design.pattern.creational.abstractfactory.pay.method.Payment;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

//支付宝支付
@Service("aliPayment")
public class AliPayment implements Payment {
    @Override
    public void pay(BigDecimal amount) {
        System.out.println("支付宝支付"+amount);
    }
}
