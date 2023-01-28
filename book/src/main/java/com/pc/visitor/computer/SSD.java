package com.pc.visitor.computer;

import com.pc.visitor.visitor.Visitor;

/**
 *
 * @author pengchao
 * @since 2023/1/18 16:38
 */
public class SSD extends ComputerElement {
    private int ssdSize;
    private int speed;


    public int getSsdSize() {
        return ssdSize;
    }

    public void setSsdSize(int ssdSize) {
        this.ssdSize = ssdSize;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public SSD(double price, int powerLevel, String function, int ssdSize, int speed) {
        super(price, powerLevel, function);
        this.ssdSize = ssdSize;
        this.speed = speed;
    }

//    @Override
//    public String introduce() {
//        return "SSD{" +
//                "ssdSize=" + ssdSize +
//                "speed=" + speed +
//                ", " + super.baseIntroduce() +
//                '}';
//    }
//
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
