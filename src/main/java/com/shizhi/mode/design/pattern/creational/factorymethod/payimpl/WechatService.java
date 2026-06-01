package com.shizhi.mode.design.pattern.creational.factorymethod.payimpl;

import com.shizhi.mode.design.pattern.creational.factorymethod.PaymentService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

//微信支付
@Service
public class WechatService implements PaymentService {
    @Override
    public void pay(BigDecimal money) {
        System.out.println("微信支付"+money);
    }
}
