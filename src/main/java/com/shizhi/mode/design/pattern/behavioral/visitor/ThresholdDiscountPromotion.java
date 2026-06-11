package com.shizhi.mode.design.pattern.behavioral.visitor;

import com.shizhi.mode.design.pattern.behavioral.visitor.item.Book;
import com.shizhi.mode.design.pattern.behavioral.visitor.item.Clothing;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

//具体访问者：满减
@RequiredArgsConstructor
public class ThresholdDiscountPromotion implements PromotionVisitor{
    private final double threshold;
    private final double reduction;
    @Getter
    private double totalDiscount = 0;

    public void visit(Book book) {
        if (book.getPrice() >= threshold) {
            totalDiscount += reduction;
        }
    }
    @Override
    public void visit(Clothing clothing) {
        if (clothing.getPrice() >= threshold) {
            totalDiscount += reduction;
        }
    }

}
