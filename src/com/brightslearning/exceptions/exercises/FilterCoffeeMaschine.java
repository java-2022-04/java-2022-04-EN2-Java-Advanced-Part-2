package com.brightslearning.exceptions.exercises;

public class FilterCoffeeMaschine extends CoffeeMaschine {
    @Override
    public void doStuff() {
        super.doStuff();
        System.out.println("I can brew FilterCoffee!");
    }

    public static void main(String[] args) {
        FilterCoffeeMaschine filterCoffeeMaschine = new FilterCoffeeMaschine();
        filterCoffeeMaschine.doStuff();

        CoffeeMaschine coffeeMaschine = new FilterCoffeeMaschine();
        coffeeMaschine.doStuff();
    }
}
