package org.patterns.decorator;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public double coast() {
        return beverage.coast() + 0.1;
    }

    @Override
    public String getDescription() {
        return STR."\{beverage.getDescription()}, Soy";
    }
}
