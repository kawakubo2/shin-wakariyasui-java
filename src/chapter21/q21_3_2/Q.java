package chapter21.q21_3_2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Q {
    public static void main(String[] args) {
        TemporalAdjuster firstDayOfNextMonth = TemporalAdjusters.firstDayOfNextMonth();
        TemporalAdjuster secondFriday = TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.FRIDAY);
        System.out.println(LocalDate.now().with(firstDayOfNextMonth).with(secondFriday));
    }
}
