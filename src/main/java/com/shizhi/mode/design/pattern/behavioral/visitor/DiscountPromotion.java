package com.shizhi.mode.design.pattern.behavioral.visitor;

import com.shizhi.mode.design.pattern.behavioral.visitor.item.Book;
import com.shizhi.mode.design.pattern.behavioral.visitor.item.Clothing;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

//具体访问者：打折
@RequiredArgsConstructor
public class DiscountPromotion implements PromotionVisitor{
    private final double discountRate;
    @Getter
    private double totalDiscount = 0;

    @Override
    public void visit(Book book) {
        totalDiscount += book.getPrice() * (1 - discountRate);
    }

    @Override
    public void visit(Clothing clothing) {
        totalDiscount += clothing.getPrice() * (1 - discountRate);
    }
}
