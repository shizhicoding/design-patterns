package com.shizhi.mode.design.pattern.structural.decorator;

import com.shizhi.mode.design.pattern.structural.decorator.coffeedecorator.MilkDecorator;
import com.shizhi.mode.design.pattern.structural.decorator.coffeedecorator.SugarDecorator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DecoratorTest {

    @Test
    public void test(){
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDatil() + " 价格：" + coffee.getCost());


        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDatil() + " 价格：" + coffee.getCost());


        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDatil() + " 价格：" + coffee.getCost());

        Coffee  myCoffee=new SugarDecorator(new MilkDecorator(new SimpleCoffee()));
        System.out.println(myCoffee.getDatil() + " 价格：" + myCoffee.getCost());
    }
}
