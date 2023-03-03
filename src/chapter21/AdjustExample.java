package chapter21;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class AdjustExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 2, 3);
        System.out.println(date);

        TemporalAdjuster nextMonday = TemporalAdjusters.next(DayOfWeek.MONDAY);
        System.out.println(date.with(nextMonday));

        TemporalAdjuster lastDay = TemporalAdjusters.lastDayOfMonth();
        System.out.println(date.with(lastDay));
    }
}
