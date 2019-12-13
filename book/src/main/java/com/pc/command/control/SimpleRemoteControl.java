package com.pc.command.control;

import com.pc.command.command.Command;

/**
 * @author dx
 * @className SimpleRemoteControl
 * @description 遥控器
 * @date 2019-08-11 16:41
 */
public class SimpleRemoteControl {

    Command slot;//插槽

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonWasPressd() {
        slot.execute();
    }

}
