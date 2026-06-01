package com.shizhi.mode.design.pattern.creational.factorymethod.payimpl;

import com.shizhi.mode.design.pattern.creational.factorymethod.PaymentService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

//支付宝支付
@Service
public class AlipayService implements PaymentService {
    @Override
    public void pay(BigDecimal money) {
        System.out.println("支付宝支付"+money);
    }
}
