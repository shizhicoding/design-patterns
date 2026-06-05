package com.shizhi.mode.design.pattern.structural.decorator.coffeedecorator;


import com.shizhi.mode.design.pattern.structural.decorator.Coffee;

//具体装饰其
public class MilkDecorator extends CoffeeDecorator{

    public MilkDecorator(Coffee coffee){
        super(coffee);
    }

    @Override
    public String getDatil() {
        return decoratorCoffee.getDatil()+"+牛奶";
    }

    @Override
    public double getCost() {
        return decoratorCoffee.getCost()+2.0;
    }
}
