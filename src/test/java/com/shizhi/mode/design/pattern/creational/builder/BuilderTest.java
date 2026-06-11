package com.shizhi.mode.design.pattern.creational.builder;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BuilderTest {

    @Test
    public void build(){
        Order build = Order.builder().orderId("1").payType("2").build();
        System.out.println(build);
    }
}
