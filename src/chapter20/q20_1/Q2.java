package chapter20.q20_1;

import chapter20.Book;

public class Q2 {
    public static void main(String[] args) {
        var list = Book.getList();

        list.stream()
            .filter(b -> "NOVEL".equals(b.getGenre()))
            .map(Book::getTitle)
            .forEach(System.out::println);
    }
}
