package com.brightslearning.timedate;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {

    //The Period class is used to modify values of a date or to obtain the difference between two dates
    public static void main(String[] args) {














        LocalDate date = LocalDate.now().plus(Period.ofDays(5)); // 5 days from today

        // difference between the two dates in days
        int numberOfDays = Period.between(LocalDate.now(), date).getDays();
        System.out.println(numberOfDays);
    }
}
