package com.pc.templateMethod;

/**
 * @author dx
 * @className CaffeineBeverage
 * @description 咖啡因饮料
 * @date 2019-08-13 15:50
 */
public abstract class CaffeineBeverage {

    //模版方法-烹饪
    final void prepareRecipe() {
        //规定烹饪算法
        boilWater();//烧水
        brew();//冲调
        pourInCup();//装杯
        if(hook()){//hook,钩子方法，一般为默认实现或者空实现,通过钩子，可以改变算法
            addCondiments();//调味
        }
    }

    public boolean hook() {
        return true;
    }

    private void pourInCup() {
        System.out.println("装杯");
    }

    private void boilWater() {
        System.out.println("烧水");
    }

    protected abstract void addCondiments();//调味不同

    protected abstract void brew();//冲调方式不同
}
