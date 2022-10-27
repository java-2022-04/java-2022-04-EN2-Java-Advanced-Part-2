package com.brightslearning.timedate;

import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTImeDemo {
    public static void main(String[] args) {

















        System.out.println(LocalDateTime.now()); // now

        LocalDateTime.now().plusDays(1); // tomorrow at this time

        LocalDateTime.now().minusHours(2); //2 hours ago

        // the date and time of January 7th 2019 at 06:30

        LocalDateTime.of(2019, Month.JANUARY, 07, 06, 30);
    }
}
