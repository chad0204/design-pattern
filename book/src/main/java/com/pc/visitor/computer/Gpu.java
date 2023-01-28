package com.pc.visitor.computer;

import com.pc.visitor.visitor.Visitor;

/**
 *
 * @author pengchao
 * @since 2023/1/18 16:36
 */
public class Gpu extends ComputerElement {

    private int pixel;//像素
    private double hertz;

    public int getPixel() {
        return pixel;
    }

    public void setPixel(int pixel) {
        this.pixel = pixel;
    }

    public double getHertz() {
        return hertz;
    }

    public void setHertz(double hertz) {
        this.hertz = hertz;
    }

    public Gpu(double price, int powerLevel, String function, int pixel, double hertz) {
        super(price, powerLevel, function);
        this.pixel = pixel;
        this.hertz = hertz;
    }

//    @Override
//    public String introduce() {
//        return "Gpu{" +
//                "pixel=" + pixel +
//                ", hertz=" + hertz +
//                ", " + super.baseIntroduce() +
//                '}';
//    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
