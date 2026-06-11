package com.shizhi.mode.design.pattern.behavioral.observer;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StockService {
    private final ApplicationEventPublisher publisher;

    public void updateStockPrice(String symbol,double oldPrice, double newPrice){
        publisher.publishEvent(new StockPriceChangedEvent(this, symbol, oldPrice, newPrice));
    }
}
