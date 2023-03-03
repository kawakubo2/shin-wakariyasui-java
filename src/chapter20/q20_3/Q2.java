package chapter20.q20_3;

import java.util.Map;
import static java.util.stream.Collectors.*;

import chapter20.Book;

public class Q2 {
    public static void main(String[] args) {
        var list = Book.getList();

        Map<Integer, String> bookMap =
            list.stream()
                .collect(toMap(Book::getNumber, Book::getTitle));

        bookMap.forEach((number, title) -> System.out.println(number + " = " + title));
    }
    
}
