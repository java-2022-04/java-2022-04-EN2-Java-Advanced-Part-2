package com.brightslearning.oop.exercise_14;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InheritanceDemo {


    private List<String> myStrings;

    public InheritanceDemo(List<String> myStrings) {
        this.myStrings = myStrings;
        ((ArrayList<String>) this.myStrings).trimToSize();
    }








    public static void main(String[] args) {

        new InheritanceDemo(new ArrayList<>());
        new InheritanceDemo(new LinkedList<>());




        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.trimToSize();

        AbstractList list = new ArrayList<>();
        list.add("");

    }

}
