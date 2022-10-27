package com.brightslearning.oop.exercise_13;

public class Vihicle {

    private int speed = 0;

    public void drive() {

    };

    public static void main(String[] args) {
        new Vihicle().excallerate(20);
    }

    public void excallerate(int plusSpeed) {
       this.speed += plusSpeed;
       injectMorePetrolIntoTheEnginye();
    }

    private void injectMorePetrolIntoTheEnginye() {
        addOxygenToEngine();
        fireSparkplugs();
    }

    private void fireSparkplugs() {
    }

    private void addOxygenToEngine() {

    }
}
