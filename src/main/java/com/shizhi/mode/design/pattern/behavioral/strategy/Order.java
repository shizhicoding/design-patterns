package com.shizhi.mode.design.pattern.behavioral.strategy;

import com.shizhi.mode.design.pattern.behavioral.strategy.discount.DiscountStrategy;
import lombok.RequiredArgsConstructor;

//实现策略
@RequiredArgsConstructor
public class Order {
    private final double originalPrice;
    private final DiscountStrategy strategy;

    public double getFinalPrice(){
        return strategy.applyDiscount(originalPrice);
    }
}
