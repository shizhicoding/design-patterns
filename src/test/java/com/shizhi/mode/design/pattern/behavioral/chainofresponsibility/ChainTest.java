package com.shizhi.mode.design.pattern.behavioral.chainofresponsibility;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ChainTest {
    @Test
    public void test(){
        Approver groupLeader = new GroupLeader("张三");
        Approver manager = new Manager("李四");
        Approver director = new Director("王五");
        groupLeader.setNextApprover(manager);
        manager.setNextApprover(director);

        System.out.println("===== 申请请假1天 =====");
        groupLeader.approve(1);

        System.out.println("\n===== 申请请假3天 =====");
        groupLeader.approve(3);

        System.out.println("\n===== 申请请假5天 =====");
        groupLeader.approve(5);

        System.out.println("\n===== 申请请假10天 =====");
        groupLeader.approve(10);
    }
}
