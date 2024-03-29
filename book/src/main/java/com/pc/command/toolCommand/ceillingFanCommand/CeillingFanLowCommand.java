package com.pc.command.toolCommand.ceillingFanCommand;

import com.pc.command.toolCommand.Command;
import com.pc.command.tool.CeilingFan;

/**
 * @author dx
 * @className GarageDoorCloseCommand
 * @description 风扇调高命令
 * @date 2019-08-11 17:34
 */
public class CeillingFanLowCommand implements Command {

    CeilingFan ceillingFan;
    int prevSpeed;//用于记录上一次状态

    public CeillingFanLowCommand(CeilingFan ceillingFan) {
        this.ceillingFan = ceillingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceillingFan.getSpeed();
        ceillingFan.low();
    }

    @Override
    public void undo() {
        switch (prevSpeed) {
            case CeilingFan.HIGH:
                ceillingFan.high();
                break;
            case CeilingFan.MEDIUM:
                ceillingFan.medium();
                break;
            case CeilingFan.LOW:
                ceillingFan.low();
                break;
            case CeilingFan.OFF:
                ceillingFan.off();
                break;
        }
    }
}
