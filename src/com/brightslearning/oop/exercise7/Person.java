package com.brightslearning.oop.exercise7;

/**
 * Finish the Teacher constructor. Use super to use the Person construtor to set the fields inherited from Person.
 * It should print “Destini 20” followed by “Erica 55 Masters in Teaching”.
 */
public class Person {
    private String name;
    private int age;

    public Person() {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String toString() {
        return getName() + " " + getAge();
    }

    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p);
        Teacher p2 = new Teacher("Erica", 55, "Masters in Teaching");
        System.out.println(p2);
    }
}

class Teacher extends Person {
    String degree;

    public String getDegree() {
        return this.degree;
    }

    public String toString() {
        return getName() + " " + getAge() + " " + getDegree();
    }

    public Teacher(String name, int age, String theDegree) {
        super();
        // ADD CODE HERE
    }
}
