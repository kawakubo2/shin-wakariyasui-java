package chapter20.q20_3;

import java.util.List;
import java.util.Map;
import static java.util.stream.Collectors.*;

import chapter20.Book;

public class Q1 {
    public static void main(String[] args) {
        var list = Book.getList();
        Map<String, List<String>> genre =
            list.stream()
                .collect(groupingBy(Book::getGenre, mapping(Book::getTitle, toList())));
        genre.forEach((key, titles) -> System.out.println(key + "=" + titles));      
    }
}
