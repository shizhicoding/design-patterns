package com.shizhi.mode.design.pattern.structural.adapter.pay;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * 微信支付（根据api定规则）
 */
@Component
public class WechatPay {
    public String wechatPay(String orderNo, BigDecimal money){
        return "【微信支付】订单：" + orderNo + "，金额：" + money + " 支付成功";
    }
}
