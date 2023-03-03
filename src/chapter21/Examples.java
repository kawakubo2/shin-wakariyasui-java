package chapter21;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Examples {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(15, 20, 35);
        System.out.println(time);

        LocalDateTime datetime = LocalDateTime.of(2020, 3, 12, 15, 20, 35);
        System.out.println(datetime);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("ahh時mm分ss秒");
        System.out.println(time.format(fmt));
    }
}
