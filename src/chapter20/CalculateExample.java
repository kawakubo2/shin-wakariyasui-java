package chapter20;

import java.util.OptionalDouble;
import java.util.OptionalInt;

public class CalculateExample {
    public static void main(String[] args) {
        var list = PC.getList();

        long count = list.stream()
                        .count();
        int sum = list.stream()
                    .mapToInt(PC::price)
                    .sum();
        OptionalDouble avg = list.stream()
                                .mapToInt(PC::price)
                                .average();
        OptionalInt max = list.stream()
                                .mapToInt(PC::price)
                                .max();
        OptionalInt min = list.stream()
                                .mapToInt(PC::price)
                                .min();

        System.out.println("件数=" + count);
        System.out.println("合計=" + sum);
        System.out.println("平均=" + avg);
        System.out.println("最大=" + max);
        System.out.println("最小=" + min);
        

    }
}
