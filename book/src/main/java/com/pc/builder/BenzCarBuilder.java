package com.pc.builder;

import java.util.List;

/**
 *
 * @author pengchao
 * @date 15:50 2022/7/17
 */
public class BenzCarBuilder extends CarBuilder {

    private final BenzCarModel benzCarModel = new BenzCarModel();

    @Override
    protected CarBuilder setSteps(List<String> steps) {
        this.benzCarModel.setSteps(steps);
        return this;
    }

    @Override
    protected AbstractCarModel build() {
        return this.benzCarModel;
    }
}
