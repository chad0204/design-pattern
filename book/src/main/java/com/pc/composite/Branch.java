package com.pc.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pengchao
 * @since 2023/1/31 14:08
 */
public class Branch implements IBranch {

    private String name;

    private String position;

    private Double salary;

    private List<ICrop> childes = new ArrayList<>();


    public Branch(String name, String position, Double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public void addCrop(ICrop iCrop) {
        this.childes.add(iCrop);
    }

    @Override
    public List<ICrop> getChildes() {
        return childes;
    }

    @Override
    public String getInfo() {
        return "Branch{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
