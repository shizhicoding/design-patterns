package com.shizhi.mode.design.pattern.creational.factorymethod;

import java.math.BigDecimal;

//支付接口
public interface PaymentService {
    void pay(BigDecimal money);
}
