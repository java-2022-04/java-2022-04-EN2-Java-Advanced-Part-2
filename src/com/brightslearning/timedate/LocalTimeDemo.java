package com.brightslearning.timedate;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeDemo {
    public static void main(String[] args) {



















        LocalTime now = LocalTime.now(); // the time now
        System.out.println(now);

        LocalTime evening = LocalTime.of(19, 30); // time of 19:30

        LocalTime morning = LocalTime.parse("07:05"); // time of 07:05

        // working with LocalTime

        LocalTime t = LocalTime.now().plus(2, ChronoUnit.HOURS); // in two hours

        LocalTime.now().getHour(); // get current hour

        // if 06:30 is before 07:30
        LocalTime.parse("06:30").isBefore(LocalTime.parse(" 07:30 "));
    }
}
