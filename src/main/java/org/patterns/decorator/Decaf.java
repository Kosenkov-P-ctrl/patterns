package org.patterns.decorator;

public class Decaf extends Beverage{
    public Decaf(){
        description = "Decaf";
    }
    @Override
    public double coast() {
        return .5;
    }
}
