package com.shizhi.mode.design.pattern.behavioral.chainofresponsibility;

//具体处理办法:组长
public class GroupLeader extends Approver{
    public GroupLeader(String name) {
        super(name);
    }
    @Override
    public void approve(int days) {
        if (days<=1) {
            System.out.println("组长【" + name + "】审批通过：请假" + days + "天");
        }
        else {
            System.out.println("组长【\" + name + \"】无权审批，转交上级...");
            nextApprover.approve(days);
        }
    }
}
