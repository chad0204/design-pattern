package com.pc.command;

import com.pc.command.tool.Light;

/**
 * @author dx
 * @className LightCommand
 * @description TODO
 * @date 2019-08-11 16:38
 */
public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }


    @Override
    public void undo() {
        light.off();
    }
}
