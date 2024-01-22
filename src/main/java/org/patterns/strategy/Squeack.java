package org.patterns.strategy;

public class Squeack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Squeack");
    }
}
