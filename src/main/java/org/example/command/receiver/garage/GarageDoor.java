package org.example.command.receiver.garage;

public class GarageDoor {
    String location;

    public GarageDoor(String location) {
        this.location = location;
    }

    public void up(){
        System.out.println("차고 문이 열렸습니다.");
    }

    public void down(){
        System.out.println("차고 문이 닫혔습니다.");
    }

    public void stop(){

    }

    public void lightOn(){

    }

    public void lightOff(){

    }
}
