package com.shizhi.mode.design.pattern.structural.composite;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//叶子结点：员工
@AllArgsConstructor
@NoArgsConstructor
public class Employee extends OrganizationComponent{
    private double salary;

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public int getCount() {
        return 1;
    }

    @Override
    public double getSalary() {
        return salary;
    }
}
