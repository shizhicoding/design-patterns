package com.shizhi.mode.design.pattern.structural.composite;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CompositeTest {

    @Test
    public void test(){
        Employee emp1 = new Employee("张三", 8000);
        Employee emp2 = new Employee("李四", 12000);
        Employee emp3 = new Employee("王五", 15000);
        Employee emp4 = new Employee("赵六", 9000);

        Department devDept = new Department("开发部");
        devDept.add(emp1);
        devDept.add(emp2);

        Department testDept = new Department("测试部");
        testDept.add(emp3);
        testDept.add(emp4);

        Department company = new Department("总公司");
        company.add(devDept);
        company.add(testDept);
        System.out.println(emp1.getName() + " 人数: " + emp1.getCount() + ", 薪资: " + emp1.getSalary());
        System.out.println(devDept.getName() + " 人数: " + devDept.getCount() + ", 总薪资: " + devDept.getSalary());
        System.out.println(company.getName() + " 人数: " + company.getCount() + ", 总薪资: " + company.getSalary());
    }
}
