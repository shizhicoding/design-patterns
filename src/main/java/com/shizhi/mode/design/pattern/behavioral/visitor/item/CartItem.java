package com.shizhi.mode.design.pattern.behavioral.visitor.item;

import com.shizhi.mode.design.pattern.behavioral.visitor.PromotionVisitor;

//抽象元素：购物车商品
public interface CartItem {
    void accept(PromotionVisitor visitor);
}
