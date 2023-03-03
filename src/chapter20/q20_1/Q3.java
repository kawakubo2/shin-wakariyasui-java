package chapter20.q20_1;

import java.util.Comparator;

import chapter20.Book;

public class Q3 {
    public static void main(String[] args) {
        var list = Book.getList();
        list.stream()
            .filter(b -> "田中宏".equals(b.getAuthor()))
            .sorted(Comparator.comparing(Book::getPrice))
            .forEach(System.out::println);
    }
}
