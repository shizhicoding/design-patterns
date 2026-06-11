package com.shizhi.mode.design.pattern.behavioral.observer;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

//自定义股票价格变动事件
public class StockPriceChangedEvent extends ApplicationEvent {
    @Getter
    private final String symbol;
    @Getter
    private final double oldPrice;
    @Getter
    private final double newPrice;

    public StockPriceChangedEvent(Object source, String symbol, double oldPrice, double newPrice) {
        super(source);
        this.symbol = symbol;
        this.oldPrice = oldPrice;
        this.newPrice = newPrice;
    }
}
