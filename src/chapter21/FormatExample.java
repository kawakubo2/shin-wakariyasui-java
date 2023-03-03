package chapter21;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2021, 7, 13);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("y年MM月dd日(eee)");
        System.out.println(date.format(fmt));
    }
}
