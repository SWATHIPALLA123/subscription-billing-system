package com.billing.system.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtil {

    // Format LocalDate

    public static String formatDate(
            LocalDate date) {

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern(
                        "dd-MM-yyyy"
                );

        return date.format(formatter);
    }

    // Format LocalDateTime

    public static String formatDateTime(
            LocalDateTime dateTime) {

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern(
                        "dd-MM-yyyy HH:mm:ss"
                );

        return dateTime.format(formatter);
    }

    // Current Date

    public static LocalDate getCurrentDate() {

        return LocalDate.now();
    }

    // Current DateTime

    public static LocalDateTime getCurrentDateTime() {

        return LocalDateTime.now();
    }
}