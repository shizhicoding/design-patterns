package com.shizhi.mode.design.pattern.behavioral.strategy;

import com.shizhi.mode.design.pattern.behavioral.strategy.discount.NoDiscount;
import com.shizhi.mode.design.pattern.behavioral.strategy.discount.PercentageDiscount;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StrategyTest {

    @Test
    public void test(){
        Order order1=new Order(200,new NoDiscount());
        Order order2=new Order(200,new PercentageDiscount(20));
        System.out.println("不打折订单"+order1.getFinalPrice());
        System.out.println("打折订单"+order2.getFinalPrice());

    }
}
