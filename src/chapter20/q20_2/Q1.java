package chapter20.q20_2;

import chapter20.Book;

public class Q1 {
    public static void main(String[] args) {
        var list = Book.getList();
        boolean result = list.stream()
                            .anyMatch(b -> "木村花子".equals(b.getAuthor()));
        System.out.println(result);
    }
}
