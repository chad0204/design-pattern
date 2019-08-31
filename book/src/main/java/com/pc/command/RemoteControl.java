package com.pc.command;

/**
 * @author dx
 * @className RemoteControl
 * @description TODO
 * @date 2019-08-11 17:36
 */
public class RemoteControl {

    Command onCommands[];
    Command offCommands[];

    Command undoCommand;



    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        for (int i =0; i<7; i++) {
            onCommands[i] = new NoCommand();//设置空对象，省得后面非空校验
            offCommands[i] = new NoCommand();
        }
        undoCommand = new NoCommand();
    }

    public void setCommand(int index, Command onCommand, Command offCommand) {
        onCommands[index] = onCommand;
        offCommands[index] = offCommand;
    }

    public void onButtonWasPushed(int index) {
        onCommands[index].execute();
        undoCommand = onCommands[index];
    }

    public void offButtonWasPushed(int index) {
        offCommands[index].execute();
        undoCommand = offCommands[index];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }



}
