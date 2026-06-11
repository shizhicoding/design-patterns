package com.shizhi.mode.design.pattern.behavioral.chainofresponsibility;

import lombok.Setter;

//抽象类：定义相关实现接口和下一个处理的引用
public abstract class  Approver {
    @Setter
    protected Approver nextApprover;

    protected  String name;

    public Approver(String name){
        this.name=name;
    }

    public abstract void approve(int days);
}
