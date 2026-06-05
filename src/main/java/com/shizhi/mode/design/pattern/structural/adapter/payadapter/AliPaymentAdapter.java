package com.shizhi.mode.design.pattern.structural.adapter.payadapter;

import com.shizhi.mode.design.pattern.structural.adapter.PaymentService;
import com.shizhi.mode.design.pattern.structural.adapter.pay.AliPay;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

//支付宝适配器
@Component
@AllArgsConstructor
public class AliPaymentAdapter implements PaymentService {
    private final AliPay aliPay;
    @Override
    public String pay(String orderId, BigDecimal amount) {
        return aliPay.aliPay(orderId,amount);
    }
}
