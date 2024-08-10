package org.example.command.receiver.stereo;

public class Stereo {
    String location;

    public Stereo(String location) {
        this.location = location;
    }

    int volume = 0;

    public void on(){
        System.out.println(location + " stereo's on.");
    }
    public void off(){
        System.out.println(location + " stereo's off.");
    }
    public void setCd(){
        System.out.println(location + " stereo CD's playing.");
    }
    public void setDvd(){

    }
    public void setRadio(){

    }
    public void setVolume(int volume){
        this.volume = volume;
        System.out.println(location + " stereo's volume has been set " + volume);
    }
}
