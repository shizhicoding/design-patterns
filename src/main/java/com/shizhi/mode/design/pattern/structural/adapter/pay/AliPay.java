package com.shizhi.mode.design.pattern.structural.adapter.pay;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * 支付宝（第三方接口，方法名/参数不统一）
 */
@Component
public class AliPay {
    public String aliPay(String tradeNo, BigDecimal totalAmount) {
        return "【支付宝】订单：" + tradeNo + "，金额：" + totalAmount + " 支付成功";
    }
}
