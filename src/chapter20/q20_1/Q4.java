package chapter20.q20_1;

import java.util.Comparator;

import chapter20.Book;

public class Q4 {
    public static void main(String[] args) {
        var list = Book.getList();

        list.stream()
            .sorted(Comparator.comparing(Book::getPrice))
            .skip(2)
            .limit(3)
            .forEach(System.out::println);
    }
}
