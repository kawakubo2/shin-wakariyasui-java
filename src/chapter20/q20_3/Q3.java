package chapter20.q20_3;

import chapter20.Book;
import static java.util.stream.Collectors.*;

public class Q3 {
    public static void main(String[] args) {
        var list = Book.getList();

        String genreList = list.stream()
            .map(Book::getGenre)
            .distinct()
            .collect(joining(", "));
        System.out.println(genreList);
    }
}
