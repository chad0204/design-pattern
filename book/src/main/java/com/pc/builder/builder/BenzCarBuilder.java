package com.pc.builder.builder;

import com.pc.builder.AbstractCarModel;
import com.pc.builder.BenzCarModel;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pengchao
 * @date 15:50 2022/7/17
 */
public class BenzCarBuilder extends CarBuilder {

//    private final BenzCarModel benzCarModel = new BenzCarModel();
    List<String> steps = new ArrayList<>();

    @Override
    public CarBuilder setSteps(List<String> steps) {
        this.steps = steps;
        return this;
    }

    @Override
    public AbstractCarModel build() {
        BenzCarModel benzCarModel = new BenzCarModel();
        benzCarModel.setSteps(steps);
        return benzCarModel;
    }
}
