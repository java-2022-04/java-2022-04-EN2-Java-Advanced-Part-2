package com.brightslearning.oop.exercise_11;

/**
 * Override the Person class’s speak function inside the Student class.
 * Make the function print “I’m a student”.
 */
public class Person {
    public void speak() {
        System.out.println("I'm a person");
    }

    public static void main(String[] args) {
        Person p1 = new Student();
        p1.speak();
    }
}

class Student extends Person {
    // ADD CODE HERE
}
