package com.pc.command.tool;

/**
 * @author dx
 * @className CeillingFan
 * @description 风扇
 * @date 2019-08-13 09:27
 */
public class CeilingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    private int speed;

    public CeilingFan(int speed) {
        this.speed = speed;
    }


    public void high() {
        speed = HIGH;
        System.out.println("强风");
    }
    public void medium() {
        speed = MEDIUM;
        System.out.println("中等");
    }
    public void low() {
        speed = LOW;
        System.out.println("弱风");
    }
    public void off() {
        speed = OFF;
        System.out.println("关闭");
    }


    public int getSpeed() {
        return speed;
    }

}
