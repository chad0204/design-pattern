package com.pc.command;

/**
 * @author dx
 * @className SimpleRemoteControl
 * @description TODO
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
