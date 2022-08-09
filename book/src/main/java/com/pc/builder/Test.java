package com.pc.builder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pengchao
 * @date 15:38 2022/7/17
 */
public class Test {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(1).append(1).toString();

        newCreate();
    }

    public static void oldCreate() {
        BenzCarModel benzCarModel = new BenzCarModel();
        List<String> steps = new ArrayList<>();
        steps.add("start");
        steps.add("alarm");
        steps.add("light");
        benzCarModel.setSteps(steps);
        benzCarModel.run();
    }


    public static void newCreate() {

        CarDirector carDirector = new CarDirector();
        //想要什么启动顺序的车，直接给你什么顺序的车
        carDirector.getABenzCar().run();
        carDirector.getABMWCar().run();

    }
}
