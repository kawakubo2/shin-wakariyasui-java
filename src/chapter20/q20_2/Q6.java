package chapter20.q20_2;

import java.util.Comparator;
import java.util.Optional;

import chapter20.Book;

public class Q6 {
    public static void main(String[] args) {
        var list = Book.getList();
        Optional<Book> book = list.stream()
                                .max(Comparator.comparing(Book::getPrice));
        System.out.println(book.get());
    }    
}
