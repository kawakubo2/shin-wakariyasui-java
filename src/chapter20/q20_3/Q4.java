package chapter20.q20_3;

import java.util.Optional;

import chapter20.Book;

public class Q4 {
    public static void main(String[] args) {
        var list = Book.getList();
        Optional<Book> maxPrice =
            list.stream()
                .max((b1, b2) -> Integer.compare(b1.getPrice(), b2.getPrice()));

        System.out.println(maxPrice.get());
    }
}
