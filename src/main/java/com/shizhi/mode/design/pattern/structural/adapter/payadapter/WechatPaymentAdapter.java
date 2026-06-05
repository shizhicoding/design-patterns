package com.shizhi.mode.design.pattern.structural.adapter.payadapter;

import com.shizhi.mode.design.pattern.structural.adapter.PaymentService;
import com.shizhi.mode.design.pattern.structural.adapter.pay.WechatPay;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;


//微信支付适配器
@Component
@AllArgsConstructor
public class WechatPaymentAdapter implements PaymentService {
    private final WechatPay wechatPay;

    @Override
    public String pay(String orderId, BigDecimal amount) {
        return wechatPay.wechatPay(orderId, amount);
    }
}
