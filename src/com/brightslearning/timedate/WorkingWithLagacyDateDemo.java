package com.brightslearning.timedate;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class WorkingWithLagacyDateDemo {

    public static void main(String[] args) {















        Date myDate = new Date();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(myDate.toInstant(), ZoneId.systemDefault());
        System.out.println(localDateTime);
    }
}
