package org.example;

import org.example.command.Command;
import org.example.command.MacroCommand;
import org.example.command.RemoteControlWithUndo;
import org.example.command.receiver.ceilingfan.CeilingFan;
import org.example.command.receiver.ceilingfan.CeilingFanHighCommand;
import org.example.command.receiver.ceilingfan.CeilingFanMediumCommand;
import org.example.command.receiver.ceilingfan.CeilingFanOffCommand;
import org.example.command.receiver.hottub.HotTub;
import org.example.command.receiver.hottub.HotTubOffCommand;
import org.example.command.receiver.hottub.HotTubOnCommand;
import org.example.command.receiver.light.Light;
import org.example.command.receiver.light.LightOffCommand;
import org.example.command.receiver.light.LightOnCommand;
import org.example.command.receiver.stereo.Stereo;
import org.example.command.receiver.stereo.StereoOffCommand;
import org.example.command.receiver.stereo.StereoOnWithCDCommand;
import org.example.command.receiver.tv.TV;
import org.example.command.receiver.tv.TVOffCommand;
import org.example.command.receiver.tv.TVOnCommand;

public class Main {
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        Light light = new Light("Living Room");
        TV tv = new TV("Living Room");
        Stereo stereo = new Stereo("Living Room");
        HotTub hotTub = new HotTub();

        LightOnCommand lightOn = new LightOnCommand(light);
        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        TVOnCommand tvOn = new TVOnCommand(tv);
        HotTubOnCommand hotTubOn = new HotTubOnCommand(hotTub);

        LightOffCommand lightOff = new LightOffCommand(light);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        TVOffCommand tvOff = new TVOffCommand(tv);
        HotTubOffCommand hotTubOff = new HotTubOffCommand(hotTub);

        Command[] partyOn = {lightOn, stereoOnWithCD, tvOn, hotTubOn};
        Command[] partyOff = {lightOff, stereoOff, tvOff, hotTubOff};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);
        System.out.println("--- Macro on ---");
        remoteControl.onButtonWasPushed(0);
        System.out.println("--- Macro off ---");
        remoteControl.offButtonWasPushed(0);


//        CeilingFan ceilingFan = new CeilingFan("Living Room");
//
//        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
//        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
//        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
//
//        remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
//        remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);
//
//        remoteControl.onButtonWasPushed(0);
//        remoteControl.offButtonWasPushed(0);
//        System.out.println(remoteControl);
//        remoteControl.undoButtonWasPushed();
//
//        remoteControl.onButtonWasPushed(1);
//        System.out.println(remoteControl);
//        remoteControl.undoButtonWasPushed();

    }
}

















