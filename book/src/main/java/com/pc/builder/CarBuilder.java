package com.pc.builder;

import java.util.List;

/**
 *
 * @author pengchao
 * @date 15:48 2022/7/17
 */
public abstract class CarBuilder {

    protected abstract CarBuilder setSteps(List<String> steps);

    protected abstract AbstractCarModel build();

}
