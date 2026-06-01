package com.shizhi.mode.design.pattern.creational.abstractfactory.pay.api.wx;

import com.shizhi.mode.design.pattern.creational.abstractfactory.pay.method.Payment;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;


//微信支付
@Service("wxPayment")
public class WxPayment implements Payment {
    @Override
    public void pay(BigDecimal amount) {
        System.out.println("微信支付"+amount);
    }
}
