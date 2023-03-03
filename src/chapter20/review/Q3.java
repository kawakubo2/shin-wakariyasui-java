package chapter20.review;
import static java.util.stream.Collectors.*;

public class Q3 {
    public static void main(String[] args) {
        var list = Sales.getList();

        String OsakaPCNames = list.stream()
            .filter(s -> "大阪".equals(s.office()))
            .map(s -> s.pc().name())
            .distinct()
            .collect(joining(" "));
        System.out.println(OsakaPCNames);
    }
}
