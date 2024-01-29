package org.patterns.decorator;

public class Mocha extends CondimentDecorator{
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public double coast() {
        return  beverage.coast() + .20;
    }

    @Override
    public String getDescription() {
        return STR."\{beverage.getDescription()}, Mocha";
    }
}
