package org.patterns.decorator;

public class Whip extends CondimentDecorator{
    public Whip(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public double coast() {
        return beverage.coast() + 1.20;
    }

    @Override
    public String getDescription() {
        return STR."\{beverage.getDescription()}, Whip";
    }
}
