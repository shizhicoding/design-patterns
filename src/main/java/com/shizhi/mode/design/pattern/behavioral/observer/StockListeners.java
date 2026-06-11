package com.shizhi.mode.design.pattern.behavioral.observer;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class StockListeners {

    @EventListener
    public void handleInvestorNotification(StockPriceChangedEvent event){
        System.out.printf("[短信通知] %s 价格变动: %.2f -> %.2f%n",
                event.getSymbol(), event.getOldPrice(), event.getNewPrice());
    }
    @EventListener
    public void handleLogging(StockPriceChangedEvent event){
        System.out.printf("[日志记录] %s 价格更新%n", event.getSymbol());
    }
}
