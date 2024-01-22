package org.patterns.strategy;

public class FlyRockerBehavior implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I`m flying with a rocket");
    }
}
