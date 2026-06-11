package com.shizhi.mode.design.pattern.behavioral.visitor.item;


import com.shizhi.mode.design.pattern.behavioral.visitor.PromotionVisitor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

//具体元素：书
@Getter
@RequiredArgsConstructor
public class Book implements CartItem{
    private final String name;
    private final double price;

    @Override
    public void accept(PromotionVisitor visitor) {
        visitor.visit(this);
    }
}
