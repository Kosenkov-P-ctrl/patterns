package org.patterns.decorator;

public class SturbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(STR."\{beverage.getDescription()} $\{beverage.coast()}");

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(STR."\{beverage1.getDescription()} $\{beverage1.coast()}");
    }
}
