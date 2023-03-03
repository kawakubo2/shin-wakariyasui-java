package chapter20.q20_2;

import chapter20.Book;

public class Q4 {
    public static void main(String[] args) {
        var list = Book.getList();

        String authors = list.stream()
            .map(Book::getAuthor)
            .distinct()
            .reduce("", (r, a) -> r + " " + a);
        System.out.println(authors);
    }
}
