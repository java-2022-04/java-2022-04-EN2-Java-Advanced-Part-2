package com.brightslearning.exceptions;

public class UncheckedExceptionDemo {

    private String myFavoriteLetters[] = {"A", "B", "C"};

    public String getMeMyFavLetterAtPosition(int position) {
        return myFavoriteLetters[position];
    }

    public static void main(String[] args) {
        UncheckedExceptionDemo checkedExceptionDemo = new UncheckedExceptionDemo();
        String meMyFavLetterAtPosition = checkedExceptionDemo.getMeMyFavLetterAtPosition(1);
        System.out.println(meMyFavLetterAtPosition);

        String meMyFavLetterAtPosition2 = checkedExceptionDemo.getMeMyFavLetterAtPosition(5);
        System.out.println(meMyFavLetterAtPosition2);


    }
}
