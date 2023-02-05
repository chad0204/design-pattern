package com.pc.command.toolCommand.light;

import com.pc.command.toolCommand.Command;
import com.pc.command.tool.Light;

/**
 * @author dx
 * @className LightCommand
 * @description 关灯
 * @date 2019-08-11 16:38
 */
public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
