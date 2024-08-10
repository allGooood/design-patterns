package org.example.command.receiver.ceilingfan;

public class CeilingFan {
    String location;

    public CeilingFan(String location) {
        this.location = location;
    }

    public void on(){
        System.out.println(location + " ceiling fan's on.");
    }

    public void off(){
        System.out.println(location + " ceiling fan's off.");
    }
}
