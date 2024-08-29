package org.example;

import org.example.adpater.*;

public class Main {
    public static void main(String[] args) {
        Duck duck = new MallarDuck();

        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("Turkey says: ");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nDuck says: ");
        testDuck(duck);

        System.out.println("\nTurkey Adapter says: ");
        testDuck(turkeyAdapter);


    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}

















