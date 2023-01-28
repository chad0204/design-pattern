package com.pc.builder.builder;

import com.pc.builder.AbstractCarModel;
import com.pc.builder.BMWCarModel;

import java.util.List;

/**
 *
 * @author pengchao
 * @date 15:50 2022/7/17
 */
public class BMWCarBuilder extends CarBuilder {

    private final BMWCarModel bmwCarModel = new BMWCarModel();

    @Override
    public CarBuilder setSteps(List<String> steps) {
        this.bmwCarModel.setSteps(steps);
        return this;
    }

    @Override
    public AbstractCarModel build() {
        return this.bmwCarModel;
    }
}
