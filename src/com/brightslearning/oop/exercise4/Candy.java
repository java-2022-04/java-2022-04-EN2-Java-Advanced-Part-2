package com.brightslearning.oop.exercise4;

/**
 * Override the taste method from the Candy class in the Chocolate class to return “tastes chocolately”.
 * It should print “tastes sweet!” and then “tastes chocolately”.
 */
public class Candy {
    public String taste() {
        return "tastes sweet!";
    }

    public static void main(String[] args) {
        Candy c1 = new Candy();
        System.out.println(c1.taste());
        Candy c2 = new Chocolate();
        System.out.println(c2.taste();
    }
}

class Chocolate extends Candy {
    // ADD CODE HERE
}

