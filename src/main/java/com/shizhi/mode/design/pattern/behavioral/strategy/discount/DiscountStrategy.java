package com.shizhi.mode.design.pattern.behavioral.strategy.discount;

//策略接口
public interface DiscountStrategy {
    double applyDiscount(double originalPrice);
}
