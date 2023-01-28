package com.pc.visitor.computer;

import com.pc.visitor.visitor.Visitor;

/**
 *
 * @author pengchao
 * @since 2023/1/18 16:41
 */
public class Mem extends ComputerElement {

    private int memSize;
    private int speed;

    public int getMemSize() {
        return memSize;
    }

    public void setMemSize(int memSize) {
        this.memSize = memSize;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Mem(double price, int powerLevel, String function, int memSize, int speed) {
        super(price, powerLevel, function);
        this.memSize = memSize;
        this.speed = speed;
    }

//    @Override
//    public String introduce() {
//        return "Mem{" +
//                "memSize=" + memSize +
//                "speed=" + speed +
//                ", " + super.baseIntroduce() +
//                '}';
//    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
