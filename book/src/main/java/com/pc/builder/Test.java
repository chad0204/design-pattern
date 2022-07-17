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
        carDirector.getABenzCar().run();
        carDirector.getABMWCar().run();

    }
}
