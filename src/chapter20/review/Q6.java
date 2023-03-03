package chapter20.review;

import java.util.Map;
import static java.util.stream.Collectors.*;

public class Q6 {
    public static void main(String[] args) {
        var list = Sales.getList();
        
        Map<String, Integer> salesByName = 
            list.stream()
                .collect(groupingBy(Sales::name, summingInt(s -> s.quantity() * s.pc().price())));

        salesByName.forEach((name, sales) -> System.out.println(name + " = " + sales));

        
    }
}
