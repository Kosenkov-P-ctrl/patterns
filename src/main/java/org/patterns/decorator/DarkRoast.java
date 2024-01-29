package org.patterns.decorator;

public class DarkRoast extends Beverage{
    public DarkRoast(){
        description = "DarkRoast";
    }
    @Override
    public double coast() {
        return 1;
    }
}
