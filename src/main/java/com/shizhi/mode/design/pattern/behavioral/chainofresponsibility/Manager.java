package com.shizhi.mode.design.pattern.behavioral.chainofresponsibility;

//具体处理办法:经理
public class Manager extends Approver{
    public Manager(String name) {
        super(name);
    }

    @Override
    public void approve(int days) {
        if (days <= 3) {
            System.out.println("经理【" + name + "】审批通过：请假" + days + "天");
        } else {
            System.out.println("经理【" + name + "】无权审批，转交上级...");
            nextApprover.approve(days);
        }
    }
}
