package org.patterns.decorator;

public class HouseBlend extends Beverage{

    public HouseBlend(){
        description = "HouseBlend";
    }
    @Override
    public double coast() {
        return .89;
    }
}
