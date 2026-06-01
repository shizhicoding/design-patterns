package com.shizhi.mode.design.pattern.creational.builder;

import lombok.Builder;
import lombok.ToString;

//建造者模式
@Builder
@ToString
public class Order {
    private String orderId;
    private Long userId;
    private Double totalAmount;
    private String payType;
    private String receiverName;
    private String receiverPhone;
    private String address;
    private String remark;
}
