package com.brightslearning.timedate.exercise;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.TimeZone;

public class TimeDateExerciseSolution {
    public static void main(String[] args) {
        // 1. how many hours do I live on this earth already
        long days = ChronoUnit.DAYS.between(LocalDate.of(1984, 10, 2), LocalDate.now());
        System.out.println(days);

        //2. Pick your favorite vacation destination and calculate what time (hour and day) it will be there in two hours from now.
        ZonedDateTime zonedDateTime = ZonedDateTime.now().withZoneSameInstant(ZoneId.of("Asia/Ho_Chi_Minh")).plusHours(2);
        System.out.println(zonedDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));

        ZonedDateTime zonedDateTimeParis = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Europe/Paris"));
        ZonedDateTime zonedDateTime1 = zonedDateTimeParis.withZoneSameInstant(ZoneId.of("Australia/Sydney"));
        System.out.println(zonedDateTime1);

        for (String string : TimeZone.getAvailableIDs()) {
            System.out.println(string);
        }
    }
}
