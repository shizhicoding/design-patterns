package com.shizhi.mode.design.pattern.structural.proxy;

import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProxyTest {

    @Test
    public void test() throws InterruptedException {
        Image image1 = new ProxyImage("photo1");
        Image image2 = new RealImage("photo2");
        Image image3 = new ProxyImage("photo3");

        // 此时还没有任何图片被加载到内存
        System.out.println("----- 第一次调用 display() -----");
        image1.display();

        System.out.println("----- 第二次调用 display() -----");
        image1.display();

        System.out.println("----- 调用另一张图片 -----");
        image2.display();

        System.out.println("----- 调用另一张图片 -----");
        image2.display();

        System.out.println("----- 调用另一张图片 -----");
        image3.display();

        System.out.println("----- 调用另一张图片 -----");
        image3.display();
    }
}
