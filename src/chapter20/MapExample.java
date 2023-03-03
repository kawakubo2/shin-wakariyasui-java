package chapter20;

import java.util.List;

import static java.util.stream.Collectors.*;

public class MapExample {
    public static void main(String[] args) {
        var list = PC.getList();

        List<String> pcMakers = list.stream()
            .map(PC::maker)
            .collect(toList());

        pcMakers.forEach(name -> System.out.println(name));
    }
}
