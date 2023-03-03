package chapter20.q20_1;

import chapter20.Book;

public class Q5 {
    public static void main(String[] args) {
        var list = Book.getList();

        list.stream()
            .map(Book::getGenre)
            .distinct()
            .sorted()
            .forEach(System.out::println);
            
            
    }
    
}
