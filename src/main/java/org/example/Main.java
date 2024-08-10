package org.example;

import org.example.command.*;
import org.example.singleton.Singleton;
import org.example.singleton.SingletonEnum;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        SimpleRemoteControl remote = new SimpleRemoteControl();

        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand command = new GarageDoorOpenCommand(garageDoor);
        remote.setCommand(command);
        remote.buttonWasPressed();
    }
}