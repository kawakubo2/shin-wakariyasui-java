package chapter20.q20_2;

import java.util.Optional;

import chapter20.Book;

public class Q2 {
    public static void main(String[] args) {
        var list = Book.getList();
        Optional<Book> anyBook = list.stream()
                            .filter(b -> "木村花子".equals(b.getAuthor()))
                            .findFirst();
        System.out.println(anyBook.get());
    }
}
