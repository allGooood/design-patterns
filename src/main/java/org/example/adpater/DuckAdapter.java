package org.example.adpater;

public class DuckAdapter implements Turkey{
    Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        System.out.println("flying one fifth");
    }
}
