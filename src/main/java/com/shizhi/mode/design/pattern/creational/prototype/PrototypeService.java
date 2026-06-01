package com.shizhi.mode.design.pattern.creational.prototype;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;


//原型模式
@Service
@Scope("prototype")
public class PrototypeService {

    Integer cont=1;

    public void say(){
        cont++;
        System.out.println("我是原型,当前cont为:"+ cont);
    }
}
