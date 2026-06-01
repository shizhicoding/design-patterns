package com.shizhi.mode.design.pattern.creational.abstractfactory.pay.method;

import java.math.BigDecimal;


//支付接口
public interface Payment {
    void pay(BigDecimal amount);
}
