package chapter21.q21_4_1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q1 {
    public static void main(String[] args) {
        LocalDateTime datetime = LocalDateTime.of(2020,1,13,15,20,15);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("Y年M月d日 ahh時mm分ss秒");
        System.out.println(datetime.format(fmt));
    }
}
