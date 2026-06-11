package com.shizhi.mode.design.pattern.behavioral.strategy.discount;

//具体策略：无打折
public class NoDiscount implements DiscountStrategy{
    @Override
    public double applyDiscount(double originalPrice) {
        return originalPrice;
    }
}
