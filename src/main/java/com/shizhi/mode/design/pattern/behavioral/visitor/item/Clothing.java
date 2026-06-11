package com.shizhi.mode.design.pattern.behavioral.visitor.item;


import com.shizhi.mode.design.pattern.behavioral.visitor.PromotionVisitor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

//具体元素：衣服
@Getter
@RequiredArgsConstructor
public class Clothing implements CartItem{
    private final String name;
    private final double price;
    private final String size;
    @Override
    public void accept(PromotionVisitor visitor) {
        visitor.visit(this);
    }
}
