package chapter20.review;

import java.util.Map;
import java.util.Map.Entry;

import static java.util.stream.Collectors.*;

public class Q7 {
    public static void main(String[] args) {
        var list = Sales.getList();
        Map<String, Integer> salesByName = 
            list.stream()
                .collect(groupingBy(Sales::name, summingInt(s -> s.quantity() * s.pc().price())));
        Entry<String, Integer> topSales = 
            salesByName
                .entrySet()
                .stream()
                .max((x, y) -> Integer.compare(salesByName.get(x.getKey()), salesByName.get(y.getKey())))
                .get();

        System.out.println(topSales.getKey() + " = " + topSales.getValue());

        
    }
}
