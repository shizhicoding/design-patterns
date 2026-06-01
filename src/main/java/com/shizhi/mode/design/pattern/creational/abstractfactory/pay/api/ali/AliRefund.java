package com.shizhi.mode.design.pattern.creational.abstractfactory.pay.api.ali;

import com.shizhi.mode.design.pattern.creational.abstractfactory.pay.method.Refund;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;


//支付宝退款
@Service("aliRefund")
public class AliRefund implements Refund {
    @Override
    public void refund(BigDecimal refundAmount) {
        System.out.println("支付宝退款"+refundAmount);
    }
}
