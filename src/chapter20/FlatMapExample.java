package chapter20;

import java.util.List;

import static java.util.stream.Collectors.*;

public class FlatMapExample {
    public static void main(String[] args) {
        var list = Department.getList();

        List<String> employees = list.stream()
            .map(Department::employees)
            .flatMap(List::stream)
            .collect(toList());

        employees.forEach(e -> System.out.println(e + " "));
    }
}
