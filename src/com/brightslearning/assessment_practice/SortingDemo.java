package com.brightslearning.assessment_practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingDemo {
    public static void main(String[] args) {
        new SortingDemo().sortStuff();
    }

    public void sortStuff() {
        List<String> myList = Arrays.asList("D", "A", "B", "C");
        System.out.println(myList);

        //1. comparator implementation classic
        myList.sort(new MyIgnoreCaseStringComparator());

        System.out.println(myList);

        //2. Anonymouse class implementation that passes a Comperator Implementation to sort()
        myList.sort(new Comparator<String>() {
            @Override
            public int compare(String stringA, String stringB) {
                return stringA.compareToIgnoreCase(stringB);
            }
        });

        //3. Lambda way of implementing the comperator
        myList.sort((stringA, stringB) -> stringA.compareToIgnoreCase(stringB));
    }

    public class MyIgnoreCaseStringComparator implements Comparator<String> {
        @Override
        public int compare(String stringA, String stringB) {
            return stringA.compareToIgnoreCase(stringB);
        }
    }
}
