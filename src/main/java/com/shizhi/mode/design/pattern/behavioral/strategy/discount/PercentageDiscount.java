package com.shizhi.mode.design.pattern.behavioral.strategy.discount;

import lombok.RequiredArgsConstructor;

//具体策略：百分比打折
@RequiredArgsConstructor
public class PercentageDiscount implements DiscountStrategy{
    private final double percent;
    @Override
    public double applyDiscount(double originalPrice) {
        return originalPrice* (1 - percent / 100);
    }
}
