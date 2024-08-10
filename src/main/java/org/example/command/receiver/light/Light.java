package org.example.command.receiver.light;

public class Light {
    String location;

    public Light(String location) {
        this.location = location;
    }

    public void on(){
        System.out.println(location + " light's on.");
    }

    public void off(){
        System.out.println(location + " light's off.");
    }
}
