package com.shizhi.mode.design.pattern.creational.singleton;


import org.springframework.stereotype.Service;


//单例模式
@Service
public class SingletonService {

    Integer cont=1;

    public void say(){
        cont++;
        System.out.println("我是单例,当前cont为:"+ cont);
    }
}
