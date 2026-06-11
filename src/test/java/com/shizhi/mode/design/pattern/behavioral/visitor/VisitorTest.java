package com.shizhi.mode.design.pattern.behavioral.visitor;
import com.shizhi.mode.design.pattern.behavioral.visitor.item.Book;
import com.shizhi.mode.design.pattern.behavioral.visitor.item.CartItem;
import com.shizhi.mode.design.pattern.behavioral.visitor.item.Clothing;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class VisitorTest {
    @Test
    public void test(){
        List<CartItem> cart = Arrays.asList(
                new Book("设计模式", 59.0),
                new Clothing("T恤", 129.0, "L")
        );
        DiscountPromotion discount = new DiscountPromotion(0.8);
        for (CartItem item : cart) {
            item.accept(discount);
        }
        System.out.printf("8折促销总优惠: %.2f 元\n", discount.getTotalDiscount());
        ThresholdDiscountPromotion threshold = new ThresholdDiscountPromotion(100, 15);
        for (CartItem item : cart) {
            item.accept(threshold);
        }
        System.out.printf("满100减15总优惠: %.2f 元\n", threshold.getTotalDiscount());
    }
}
