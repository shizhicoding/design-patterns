package com.shizhi.mode.design.pattern.structural.adapter;


import java.math.BigDecimal;

//统一支付接口
public interface PaymentService {

    String pay(String orderId, BigDecimal amount);
}
