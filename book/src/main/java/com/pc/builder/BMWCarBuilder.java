package com.pc.builder;

import java.util.List;

/**
 *
 * @author pengchao
 * @date 15:50 2022/7/17
 */
public class BMWCarBuilder extends CarBuilder {

    private final BMWCarModel bmwCarModel = new BMWCarModel();

    @Override
    protected CarBuilder setSteps(List<String> steps) {
        this.bmwCarModel.setSteps(steps);
        return this;
    }

    @Override
    protected AbstractCarModel build() {
        return this.bmwCarModel;
    }
}
