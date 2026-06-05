package com.shizhi.mode.design.pattern.structural.facade;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FacadeTest {
    @Autowired
    private HomeTheaterFacade homeTheaterFacade;

    @Test
    public void test(){
        homeTheaterFacade.watchMovie("hhh");
        homeTheaterFacade.endMovie();
    }
}
