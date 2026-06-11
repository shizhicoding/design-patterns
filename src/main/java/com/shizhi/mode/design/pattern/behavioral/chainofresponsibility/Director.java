package com.shizhi.mode.design.pattern.behavioral.chainofresponsibility;

//具体处理办法:总监
public class Director extends Approver{
    public Director(String name) {
        super(name);
    }
    @Override
    public void approve(int days) {
        if (days <= 7) {
            System.out.println("总监【" + name + "】审批通过：请假" + days + "天");
        } else {
            // 无人可传，直接驳回
            System.out.println("请假" + days + "天时间过长，【全部审批人】均无权处理，申请驳回！");
        }
    }
}
