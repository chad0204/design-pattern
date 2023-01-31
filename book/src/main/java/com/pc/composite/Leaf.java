package com.pc.composite;

/**
 *
 * @author pengchao
 * @since 2023/1/31 14:02
 */
public class Leaf implements ILeaf {

    private String name;

    private String position;

    private Double salary;


    public Leaf(String name, String position, Double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String getInfo() {
        return "Leaf{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
