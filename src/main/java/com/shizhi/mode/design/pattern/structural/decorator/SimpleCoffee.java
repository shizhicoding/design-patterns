package com.shizhi.mode.design.pattern.structural.decorator;

//基础咖啡（准备被修饰）
public class SimpleCoffee implements Coffee{
    @Override
    public String getDatil() {
        return "普通咖啡";
    }

    @Override
    public double getCost() {
        return 5.9;
    }
}
