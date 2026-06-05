package com.shizhi.mode.design.pattern.structural.proxy;

import org.springframework.stereotype.Component;


public class RealImage implements Image{

    private String filename;

    public RealImage(String filename)  {
        this.filename=filename;
        loadFromDisk();
    }
    private void loadFromDisk(){
        System.out.println("从硬盘加载图片：" + filename );
    }

    @Override
    public void display() {
        System.out.println("显示图片：" + filename);
    }
}
