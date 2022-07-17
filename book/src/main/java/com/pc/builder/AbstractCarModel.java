package com.pc.builder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pengchao
 * @date 15:39 2022/7/17
 */
public abstract class AbstractCarModel {

    List<String> steps = new ArrayList<>();

    protected abstract void start();
    protected abstract void light();
    protected abstract void alarm();
    protected abstract void stop();

    public void run() {
        for (String step : steps) {
            if (step.equals("start")) {
                this.start();
            } else if (step.equals("light")) {
                this.light();
            }if (step.equals("alarm")) {
                this.alarm();
            }if (step.equals("stop")) {
                this.stop();
            }
        }
    }

    public void setSteps(List<String> steps) {
        this.steps = steps;
    }
}
