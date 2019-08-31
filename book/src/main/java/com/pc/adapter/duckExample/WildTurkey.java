package com.pc.adapter.duckExample;

/**
 * @author dx
 * @className WildTurkey
 * @description 被适合的类
 * @date 2019-08-13 14:17
 */
public class WildTurkey implements Turkey {
    @Override
    public void gege() {
        System.out.println("Turkey gege");
    }

    @Override
    public void fly() {
        System.out.println("Turkey fly short");
    }
}
