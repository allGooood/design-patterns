package org.example.adpater;

public class MallarDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("quack!");
    }

    @Override
    public void fly() {
        System.out.println("flying!");
    }
}
