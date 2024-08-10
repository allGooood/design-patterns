package org.example;

import org.example.command.RemoteControl;
import org.example.command.receiver.ceilingfan.CeilingFan;
import org.example.command.receiver.ceilingfan.CeilingFanOffCommand;
import org.example.command.receiver.ceilingfan.CeilingFanOnCommand;
import org.example.command.receiver.garage.GarageDoor;
import org.example.command.receiver.garage.GarageDoorDownCommand;
import org.example.command.receiver.garage.GarageDoorUpCommand;
import org.example.command.receiver.light.Light;
import org.example.command.receiver.light.LightOffCommand;
import org.example.command.receiver.light.LightOnCommand;
import org.example.command.receiver.stereo.Stereo;
import org.example.command.receiver.stereo.StereoOffCommand;
import org.example.command.receiver.stereo.StereoOnWithCDCommand;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        SimpleRemoteControl remote = new SimpleRemoteControl();
//
//        Light light = new Light();
//        LightOnCommand lightOn = new LightOnCommand(light);
//        remote.setCommand(lightOn);
//        remote.buttonWasPressed();
//
//        GarageDoor garageDoor = new GarageDoor();
//        GarageDoorOpenCommand command = new GarageDoorOpenCommand(garageDoor);
//        remote.setCommand(command);
//        remote.buttonWasPressed();


        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("Garage");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
        remoteControl.setCommand(3, stereoOnWithCD, stereoOff);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
    }
}

















