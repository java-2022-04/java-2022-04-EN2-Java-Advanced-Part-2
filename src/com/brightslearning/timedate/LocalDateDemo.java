package com.brightslearning.timedate;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalDateDemo {

    public static void main(String[] args) {














        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate today = LocalDate.of(2022, 10, 26);
        System.out.println(today);

        LocalDate parsedDate = LocalDate.parse("2022-10-07");
        System.out.println(parsedDate);


        // working with localDate
        LocalDate.now().plusDays(1); // tomorrow

        LocalDate.now().minus(2, ChronoUnit.MONTHS); // 2 months ago

        LocalDate.now().isLeapYear(); // if this year is a leap year

        // if the first date is before the second date
        LocalDate.of(2019, 1, 1).isBefore(LocalDate.of(2019, 2, 2));

        // Constants like
        LocalTime[] constants = {LocalTime.MAX, LocalTime.MIN, LocalTime.NOON, LocalTime.MIDNIGHT};
    }
}
