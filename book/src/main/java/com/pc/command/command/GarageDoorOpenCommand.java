package com.pc.command.command;

import com.pc.command.tool.Garage;

/**
 * @author dx
 * @className GarageDoorOpenCommand
 * @description 开门命令
 * @date 2019-08-11 16:46
 */
public class GarageDoorOpenCommand implements Command {


    Garage garage;

    public GarageDoorOpenCommand(Garage garage) {
        this.garage = garage;
    }


    @Override
    public void execute() {
        garage.open();
    }

    @Override
    public void undo() {
        garage.close();
    }
}
