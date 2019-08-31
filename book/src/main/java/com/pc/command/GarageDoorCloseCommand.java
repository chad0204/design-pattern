package com.pc.command;

import com.pc.command.tool.Garage;

/**
 * @author dx
 * @className GarageDoorCloseCommand
 * @description TODO
 * @date 2019-08-11 17:34
 */
public class GarageDoorCloseCommand implements Command {

    Garage garage;

    public GarageDoorCloseCommand(Garage garage) {
        this.garage = garage;
    }

    @Override
    public void execute() {
        garage.close();
    }

    @Override
    public void undo() {
        garage.open();
    }
}
