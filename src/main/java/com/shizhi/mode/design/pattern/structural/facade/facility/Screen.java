package com.shizhi.mode.design.pattern.structural.facade.facility;

import org.springframework.stereotype.Component;

@Component
public class Screen {
    public void down() { System.out.println("屏幕 下降"); }
    public void up() { System.out.println("屏幕 上升"); }
}
