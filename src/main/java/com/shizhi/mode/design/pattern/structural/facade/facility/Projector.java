package com.shizhi.mode.design.pattern.structural.facade.facility;

import org.springframework.stereotype.Component;

@Component
public class Projector {
    public void on() { System.out.println("投影仪 开机"); }
    public void setInput(DvdPlayer dvd) { System.out.println("投影仪 输入设为DVD"); }
    public void off() { System.out.println("投影仪 关机"); }
}
