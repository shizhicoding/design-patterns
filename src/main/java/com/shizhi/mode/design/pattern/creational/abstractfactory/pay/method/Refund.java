package com.shizhi.mode.design.pattern.creational.abstractfactory.pay.method;

import java.math.BigDecimal;


//退款接口
public interface Refund {
    void refund(BigDecimal refundAmount);
}
