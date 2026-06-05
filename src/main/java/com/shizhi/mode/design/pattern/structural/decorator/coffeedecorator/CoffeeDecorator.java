package com.shizhi.mode.design.pattern.structural.decorator.coffeedecorator;

import com.shizhi.mode.design.pattern.structural.decorator.Coffee;

//抽象装饰器
public abstract class CoffeeDecorator implements Coffee {
    protected  Coffee decoratorCoffee;

    public CoffeeDecorator(Coffee coffee){
        this.decoratorCoffee=coffee;
    }
}
