package com.pc.visitor.computer;

import com.pc.visitor.visitor.Visitor;

/**
 * 电脑元件
 *
 * @author pengchao
 * @since 2023/1/18 16:32
 */
public abstract class ComputerElement {
    protected double price;//价格
    protected int powerLevel;//功耗
    protected String function;//功能

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public ComputerElement(double price, int powerLevel, String function) {
        this.price = price;
        this.powerLevel = powerLevel;
        this.function = function;
    }

    /**
     * 产品基本参数说明
     *
     * 将该方法抽象到Visitor, 不同的visitor实现类
     *
     */
    public final String baseIntroduce() {
        return "ComputerElement{" +
                "price=" + price +
                ", powerLevel=" + powerLevel +
                ", function='" + function + '\'' +
                '}';
    }


    public abstract void accept(Visitor visitor);

}
