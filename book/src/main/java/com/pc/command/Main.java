package com.pc.command;

import com.pc.command.tool.CeilingFan;
import com.pc.command.tool.Garage;
import com.pc.command.tool.Light;

/**
 * @author dx
 * @className Main
 * @description TODO
 * @date 2019-08-11 16:43
 */
public class Main {

    public static void main(String[] args) {
        //遥控器并并不关心塞入的什么命令，它只管执行
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();

        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        simpleRemoteControl.setCommand(lightOn);
        simpleRemoteControl.buttonWasPressd();


        Garage garage = new Garage();
        GarageDoorOpenCommand garageClose = new GarageDoorOpenCommand(garage);
        simpleRemoteControl.setCommand(garageClose);
        simpleRemoteControl.buttonWasPressd();



        //---------------------多插槽遥控器-----------------------------


        RemoteControl control = new RemoteControl();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        GarageDoorOpenCommand openCommand = new GarageDoorOpenCommand(garage);
        GarageDoorCloseCommand closeCommand = new GarageDoorCloseCommand(garage);


        control.setCommand(0,lightOnCommand,lightOffCommand);
        control.setCommand(1,openCommand,closeCommand);


        control.offButtonWasPushed(0);

        control.onButtonWasPushed(1);
        control.undoButtonWasPushed();


        CeilingFan ceilingFan = new CeilingFan(0);
        CeillingFanHighCommand ceillingFanHighCommand = new CeillingFanHighCommand(ceilingFan);
        CeillingFanOffCommand ceillingFanOffCommand = new CeillingFanOffCommand(ceilingFan);
        control.setCommand(2,ceillingFanHighCommand, ceillingFanOffCommand);


        control.onButtonWasPushed(2);//强风
        control.undoButtonWasPushed();


    }





}
