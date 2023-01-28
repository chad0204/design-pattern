package com.pc.builder;

import com.pc.builder.builder.BMWCarBuilder;
import com.pc.builder.builder.BenzCarBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pengchao
 * @date 15:56 2022/7/17
 */
public class CarDirector {

    private List<String> steps = new ArrayList<>();
    private BenzCarBuilder benzCarBuilder = new BenzCarBuilder();
    private BMWCarBuilder bmwCarBuilder = new BMWCarBuilder();


    public AbstractCarModel getABenzCar() {
        this.steps.clear();
        this.steps.add("start");
        this.steps.add("alarm");
        this.steps.add("light");
        return benzCarBuilder.setSteps(steps).build();
    }

    public AbstractCarModel getBBenzCar() {
        this.steps.clear();
        this.steps.add("alarm");
        this.steps.add("light");
        this.steps.add("start");
        return benzCarBuilder.setSteps(steps).build();
    }

    public AbstractCarModel getABMWCar() {
        this.steps.clear();
        this.steps.add("start");
        this.steps.add("alarm");
        this.steps.add("light");
        return bmwCarBuilder.setSteps(steps).build();
    }
}
