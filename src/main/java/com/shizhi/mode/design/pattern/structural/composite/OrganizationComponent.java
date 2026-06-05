package com.shizhi.mode.design.pattern.structural.composite;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//抽象构件：组织
@AllArgsConstructor
@NoArgsConstructor
@Data
public abstract class OrganizationComponent {
    protected String name;

    public  abstract int getCount();
    public abstract  double getSalary();

    public void add(OrganizationComponent component){
        throw new UnsupportedOperationException();
    }
}
