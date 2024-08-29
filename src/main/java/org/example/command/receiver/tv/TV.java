package org.example.command.receiver.tv;

public class TV {
    String location;
    int volume;
    int channel;

    public TV(String location) {
        this.location = location;
    }

    public void on(){
        System.out.println(location + " TV's on.");
    }

    public void off(){
        System.out.println(location + " TV's off.");
    }

    public void setInputChannel(int channel){
        this.channel = channel;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }
}
