package chapter21.q24_4_2;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q4 {
    public static void main(String[] args) {
        LocalDateTime d1 = LocalDateTime.of(2020, 2, 21, 13, 0, 0);
        LocalDateTime d2 = LocalDateTime.of(2021, 5, 7, 10, 15, 30);
        LocalDateTime d3 = d1.plusMinutes(3245).plusSeconds(320);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("Y/M/d ahh:mm:ss");
        System.out.println(d3.format(fmt));
        Duration d = Duration.between(d1, d2);
        System.out.printf("全期間は%d秒間%n", d.toSeconds());
    }
}
