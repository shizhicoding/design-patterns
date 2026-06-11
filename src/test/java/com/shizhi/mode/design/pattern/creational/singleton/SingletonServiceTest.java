package com.shizhi.mode.design.pattern.creational.singleton;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

//单例模式方法测试
@SpringBootTest
public class SingletonServiceTest {

    @Autowired
    private ApplicationContext applicationContext;


    @Test
    public void multiThreadTest() throws InterruptedException {

        for (int i=0;i<4;i++){

            SingletonService service1 = applicationContext.getBean(SingletonService .class);
            System.out.println("第"+i+"次"+"cont=");
            service1.say();
        }


    }


}
