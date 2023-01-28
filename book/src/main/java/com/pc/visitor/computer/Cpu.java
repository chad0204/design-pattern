package com.pc.visitor.computer;

import com.pc.visitor.visitor.Visitor;

/**
 *
 * @author pengchao
 * @since 2023/1/18 16:36
 */
public class Cpu extends ComputerElement {

    private int cores;
    private double hertz;

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public double getHertz() {
        return hertz;
    }

    public void setHertz(double hertz) {
        this.hertz = hertz;
    }

    public Cpu(double price, int powerLevel, String function, int cores, double hertz) {
        super(price, powerLevel, function);
        this.cores = cores;
        this.hertz = hertz;
    }

//    @Override
//    public String introduce() {
//        return "Cpu{" +
//                "cores=" + cores +
//                ", hertz=" + hertz +
//                ", " + super.baseIntroduce() +
//                '}';
//    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
