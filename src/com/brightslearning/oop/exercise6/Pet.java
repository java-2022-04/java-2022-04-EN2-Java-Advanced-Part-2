package com.brightslearning.oop.exercise6;

/**
 * Add a call to Pet’s brag method before printing anything in Dog’s brag method
 * (hint: use super to call an overridden method).
 * It should print “I have the best pet!” and then “I have the best dog”.
 */
public class Pet {
    public void brag() {
        System.out.println("I have the best pet!");
    }

    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.brag();
    }
}

class Dog extends Pet {
    public void brag() {
        // ADD CODE HERE

        System.out.println("I have the best dog!");
    }
}
