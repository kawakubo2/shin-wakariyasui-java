package chapter20;

import java.util.Map;
import static java.util.stream.Collectors.*;

public class CalculatingExample {
    public static void main(String[] args) {
        var list = Book.getList();
        Map<String, Integer> genreSum = list.stream()
                                .collect(groupingBy(Book::getGenre, summingInt(Book::getPrice)));
        genreSum.forEach((k, v) -> System.out.println(k + ": " + v));


    }
}
