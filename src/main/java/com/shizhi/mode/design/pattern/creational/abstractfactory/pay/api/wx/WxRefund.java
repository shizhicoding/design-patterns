package com.shizhi.mode.design.pattern.creational.abstractfactory.pay.api.wx;

import com.shizhi.mode.design.pattern.creational.abstractfactory.pay.method.Refund;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;


//微信退款
@Service("wxRefund")
public class WxRefund implements Refund {
    @Override
    public void refund(BigDecimal refundAmount) {
        System.out.println("微信退款"+refundAmount);
    }
}
