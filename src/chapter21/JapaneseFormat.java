package chapter21;

import java.time.LocalDate;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class JapaneseFormat {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2021, 7, 13);
        JapaneseDate jdate = JapaneseDate.from(date);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("GGGGGy年MM月dd日 eeee");       
        System.out.println(jdate.format(fmt));

        System.out.println(date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.JAPAN));
    }
}
