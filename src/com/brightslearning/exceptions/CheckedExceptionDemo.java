package com.brightslearning.exceptions;

public class CheckedExceptionDemo {

    public CheckedExceptionDemo() {

    }

    public void printMyStringLength(String myString)  {
        if (myString != null) {
            System.out.println(myString.length());
            return;
        }
        System.out.println("0 - the String has not been initialised");
    }


    //EXTERNAL CALLER Programm A
    public static void main(String[] args)  {

        CheckedExceptionDemo checkedExceptionDemo = new CheckedExceptionDemo();
        String myString = null;
        checkedExceptionDemo.printMyStringLength(myString);

    }
}
