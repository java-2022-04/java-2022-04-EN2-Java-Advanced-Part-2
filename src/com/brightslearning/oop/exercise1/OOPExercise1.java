package com.brightslearning.oop.exercise1;

/**
 * Task 1
 * Write a method that overloads the talk method by taking in a name and printing “Hello” with that name.
 */
public class OOPExercise1 {
    public static void talk() {
        System.out.println("hello there!");
    }

    public static void main(String[] args) {
        talk("Matthew");
    }

}
