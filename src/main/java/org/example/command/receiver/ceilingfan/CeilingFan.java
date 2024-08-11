package org.example.command.receiver.ceilingfan;

public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high(){
        speed = HIGH;
        System.out.println(location + " ceiling fan speed's been set HIGH");
        // 선풍기 속도를 HIGH로 맞추는 코드
    }

    public void medium(){
        speed = MEDIUM;
        System.out.println(location + " ceiling fan speed's been set MEDIUM");
        // 선풍기 속도를 MEDIUM으로 맞추는 코드
    }

    public void low(){
        speed = LOW;
        System.out.println(location + " ceiling fan speed's been set LOW");
        // 선풍기 속도를 LOW로 맞추는 코드
    }

    public void on(){
        speed = LOW;
        System.out.println(location + " ceiling fan's on.");
    }

    public void off(){
        speed = OFF;
        System.out.println(location + " ceiling fan's off.");
    }

    public int getSpeed() {
        return speed;
    }
}
