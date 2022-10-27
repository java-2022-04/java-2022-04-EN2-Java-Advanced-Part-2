package com.brightslearning.oop.exercise9;

/**
 * Correctly finish the Dog subclass for the following abstract Animal class.
 * Override the abstract methods. It should print “woof” and then “num num”.
 */
abstract class Animal {
    public String name;
    public int numLegs;

    public abstract void speak();

    public abstract void eat();

    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.speak();
        myDog.eat();
    }

}

class Dog extends Animal {

    // ADD CODE HERE

    @Override
    public void speak() {
        System.out.println("speak as a dog");
    }

    @Override
    public void eat() {

    }
}
