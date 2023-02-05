package com.pc.command;

import com.pc.command.toolCommand.ceillingFanCommand.CeillingFanLowCommand;
import com.pc.command.toolCommand.ceillingFanCommand.CeillingFanMediumCommand;
import com.pc.command.toolCommand.ceillingFanCommand.CeillingFanOffCommand;
import com.pc.command.toolCommand.garageDoor.GarageDoorCloseCommand;
import com.pc.command.toolCommand.garageDoor.GarageDoorOpenCommand;
import com.pc.command.toolCommand.ceillingFanCommand.CeillingFanHighCommand;
import com.pc.command.toolCommand.light.LightOffCommand;
import com.pc.command.toolCommand.light.LightOnCommand;
import com.pc.command.control.RemoteControl;
import com.pc.command.control.SimpleRemoteControl;
import com.pc.command.tool.CeilingFan;
import com.pc.command.tool.Garage;
import com.pc.command.tool.Light;


/**
 * @author dx
 * @className Main
 * @description 插槽遥控器
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


        control.setCommand(0,lightOnCommand,lightOffCommand);//插槽0的两个开关
        control.setCommand(1,openCommand,closeCommand);//插槽1的两个开关


        control.offButtonWasPushed(0);
        control.onButtonWasPushed(1);
        control.undoButtonWasPushed();


        //---------------------换挡-----------------------------
        CeilingFan ceilingFan = new CeilingFan(0);//初始风速关闭
//        //TODO 暂未提供中速和低速档
        CeillingFanHighCommand ceillingFanHighCommand = new CeillingFanHighCommand(ceilingFan);//强风挡
        CeillingFanMediumCommand ceillingFanMediumCommand = new CeillingFanMediumCommand(ceilingFan);//中风挡
        CeillingFanLowCommand ceillingFanLowCommand = new CeillingFanLowCommand(ceilingFan);//弱风档
        CeillingFanOffCommand ceillingFanOffCommand = new CeillingFanOffCommand(ceilingFan);//关闭挡

        control.setCommand(2,ceillingFanHighCommand, ceillingFanOffCommand);
        control.setCommand(3,ceillingFanMediumCommand, ceillingFanOffCommand);
        control.setCommand(4,ceillingFanLowCommand, ceillingFanOffCommand);

        control.onButtonWasPushed(4);//弱风
        control.onButtonWasPushed(3);//中风
        control.onButtonWasPushed(2);//强风


        control.undoButtonWasPushed();//撤销到按钮2的命令的前一个风速



    }





}
