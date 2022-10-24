package com.brightslearning.oop.exercise5;

/**
 * Overload the greet method to just print “Hello” if not given any parameters.
 * It should print “Hello” and then “Hello Sansa”.
 */
public class Student {
    public static void greet(String name) {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        greet();
        greet("Sansa");
    }
}
