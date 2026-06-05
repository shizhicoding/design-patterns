package com.shizhi.mode.design.pattern.structural.facade.facility;

import org.springframework.stereotype.Component;

@Component
public class DvdPlayer {
    public void on() { System.out.println("DVD 开机"); }
    public void play(String movie) { System.out.println("正在播放 " + movie); }
    public void off() { System.out.println("DVD 关机"); }
}
