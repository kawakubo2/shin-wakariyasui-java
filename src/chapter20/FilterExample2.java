package chapter20;

import java.util.List;

import static java.util.stream.Collectors.*;

public class FilterExample2 {
    public static void main(String[] args) {
        var list = PC.getList();

        List<PC> makerPanan = list.stream()
            .filter(pc -> "Panan".equals(pc.maker()))
            .collect(toList());

        makerPanan.forEach(System.out::println);
    }
}
