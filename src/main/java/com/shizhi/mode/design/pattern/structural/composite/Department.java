package com.shizhi.mode.design.pattern.structural.composite;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


//容器：部门
@NoArgsConstructor
@AllArgsConstructor
public class Department extends OrganizationComponent{
    private List<OrganizationComponent> components=new ArrayList<>();
    public Department(String name) {
        super(name);
    }
    public void add(OrganizationComponent component){
        components.add(component);
    }
    @Override
    public int getCount() {
        int total = 0;
        for (OrganizationComponent c : components) {
            total += c.getCount();
        }
        return total;
    }

    @Override
    public double getSalary() {
        double total = 0;
        for (OrganizationComponent c : components) {
            total += c.getSalary();
        }
        return total;
    }
}
