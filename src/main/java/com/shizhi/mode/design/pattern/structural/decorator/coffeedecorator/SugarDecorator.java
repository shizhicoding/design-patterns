package com.shizhi.mode.design.pattern.structural.decorator.coffeedecorator;

import com.shizhi.mode.design.pattern.structural.decorator.Coffee;

//具体装饰器
public class SugarDecorator extends CoffeeDecorator {

    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDatil() {
        return decoratorCoffee.getDatil()+"+糖";
    }

    @Override
    public double getCost() {
        return decoratorCoffee.getCost()+1.0;
    }
}
