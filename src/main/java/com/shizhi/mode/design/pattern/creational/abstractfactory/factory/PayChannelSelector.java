package com.shizhi.mode.design.pattern.creational.abstractfactory.factory;

import com.shizhi.mode.design.pattern.creational.abstractfactory.pay.method.Payment;
import com.shizhi.mode.design.pattern.creational.abstractfactory.pay.method.Refund;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;

//代码选择器
@Component
@RequiredArgsConstructor
public class PayChannelSelector {
    private final Map<String, Payment>paymentMap;
    private final Map<String, Refund>refundMap;

    public PayFactory get(String type){
        Payment payment = paymentMap.get(type+"Payment");
        Refund refund = refundMap.get(type+"Refund");
        return new PayFactory() {
            @Override
            public Payment getPayment() {
                return payment;
            }

            @Override
            public Refund getRefund() {
                return refund;
            }
        };
    }

}
