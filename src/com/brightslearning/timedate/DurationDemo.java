package com.brightslearning.timedate;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationDemo {
    public static void main(String[] args) {
















        // the time in 9 seconds
        LocalTime time = LocalTime.now().plus(Duration.ofSeconds(9));
        System.out.println(time);
        // Works also with LocalDateTime

        LocalDateTime futureDateTime = LocalDateTime.now().minusHours(2);

        Duration duration = Duration.between(LocalDateTime.now(), futureDateTime);

        boolean isTargetDateInPast = duration.isNegative();
        System.out.println(isTargetDateInPast);

        long hours = duration.abs().toHours();
        System.out.println(hours);
    }
}
