package chapter20;

import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.*;

public class SortedExample {
    public static void main(String[] args) {
        var list = PC.getList();
        List<PC> sortedPCs = list.stream()
            .sorted(Comparator.comparing(PC::price))
            .collect(toList());

        sortedPCs.forEach(System.out::println);
    }
}
