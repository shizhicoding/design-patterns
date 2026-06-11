package com.shizhi.mode.design.pattern.behavioral.observer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ObserverTest {
    @Autowired
    private StockService stockService;

    @Test
    public void test(){
        stockService.updateStockPrice("深度求索有限公司", 150.0, 152.5);
    }
}
