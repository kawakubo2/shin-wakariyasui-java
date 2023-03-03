package chapter21;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodExample {
    public static void main(String[] args) {
        LocalDate birthdate = LocalDate.of(1998, 7, 13);
        LocalDate today = LocalDate.now();
        System.out.println(birthdate + "～" + today);

        long days = ChronoUnit.DAYS.between(birthdate, today);
        System.out.println("生まれた日から" + days + "日");

        Period period = Period.between(birthdate, today);
        System.out.println(period.getYears() + "歳");
        System.out.println(period.getMonths() + "か月");
        System.out.println(period.getDays() + "日");
    }
    
}
