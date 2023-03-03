package chapter20.q20_1;

import chapter20.Book;

public class Q1 {
    public static void main(String[] args) {
        var list = Book.getList();

        list.stream()
            .filter(b -> !b.isStock())
            .forEach(System.out::println);
    }
    
}
