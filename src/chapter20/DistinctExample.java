package chapter20;

import static java.util.stream.Collectors.*;

import java.util.List;

public class DistinctExample {
    public static void main(String[] args) {
        var list = PC.getList();

        List<String> makers = list.stream()
            .map(PC::maker)
            .distinct()
            .collect(toList());

        makers.forEach(name -> System.out.println(name + " "));
    }
}
