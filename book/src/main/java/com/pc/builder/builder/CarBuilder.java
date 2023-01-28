package com.pc.builder.builder;

import com.pc.builder.AbstractCarModel;

import java.util.List;

/**
 *
 * @author pengchao
 * @date 15:48 2022/7/17
 */
public abstract class CarBuilder {

    protected abstract CarBuilder setSteps(List<String> steps);

    public abstract AbstractCarModel build();

}
