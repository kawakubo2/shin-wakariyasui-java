package chapter20;

import java.util.Map;
import static java.util.stream.Collectors.*;

public class ToMapExample {
    public static void main(String[] args) {
        var list = PC.getList();
        Map<String, Integer> pcMap = list.stream()
            /* キーが重複する場合、IllegalStateExceptionが発生する Duplicate key Foo */
            .collect(toMap(PC::name, PC::price));
        pcMap.forEach((k, v) -> System.out.println(k + " = " + v));
    }
}
