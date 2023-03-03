package chapter21.q24_4_2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Q2 {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.of(2020, 1, 1);    
        LocalDate d2 = LocalDate.of(2020, 7, 1);    
        LocalDate d3 = LocalDate.of(2020, 9, 1);    
        LocalDate d4 = LocalDate.of(2020, 10, 1);    
        TemporalAdjuster secondMonday = TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.MONDAY);
        TemporalAdjuster thirdMonday = TemporalAdjusters.dayOfWeekInMonth(3, DayOfWeek.MONDAY);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("MM月dd日 eee");

        System.out.println(d1.with(secondMonday).format(fmt));
        System.out.println(d2.with(thirdMonday).format(fmt));
        System.out.println(d3.with(thirdMonday).format(fmt));
        System.out.println(d4.with(secondMonday).format(fmt));

    }

}
