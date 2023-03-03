package chapter20.q20_2;

import java.util.OptionalDouble;

import chapter20.Book;

public class Q5 {
    public static void main(String[] args) {
        var list = Book.getList();
        OptionalDouble avg = list.stream()
                                .mapToInt(Book::getPrice)
                                .average();
        System.out.println(avg.getAsDouble());
    }
}
