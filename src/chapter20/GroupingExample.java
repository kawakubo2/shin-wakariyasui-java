package chapter20;

import java.util.List;
import java.util.Map;
import static java.util.stream.Collectors.*;

public class GroupingExample {
    public static void main(String[] args) {
        var list = PC.getList();

        Map<String, Map<String, List<PC>>> typeGroup 
            = list.stream()
                .collect(groupingBy(PC::type, groupingBy(PC::maker)));

        typeGroup.forEach((k, v) -> System.out.println(k + " = " + v));
        
    }
    
}
