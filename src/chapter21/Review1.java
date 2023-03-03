package chapter21;

import java.time.LocalDate;
import java.time.Period;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;

public class Review1 {
    public static void main(String[] args) {
        LocalDate parisOlympic = LocalDate.of(2024, 8, 2);
        JapaneseDate jDate = JapaneseDate.from(parisOlympic);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("GGGGy年M月d日 eee");
        System.out.println(jDate.format(fmt));

        Period p = Period.between(LocalDate.of(2018, 2, 1), parisOlympic);
        System.out.printf("パリオリンピックまで%d年%d月%d日%n", p.getYears(), p.getMonths(), p.getDays());
    }
}
