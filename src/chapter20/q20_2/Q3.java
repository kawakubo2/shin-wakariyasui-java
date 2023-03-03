package chapter20.q20_2;

import chapter20.Book;

public class Q3 {
    public static void main(String[] args) {
        var list = Book.getList();
        list.stream()
            .filter(b -> "木村花子".equals(b.getAuthor()))
            .findFirst()
            .ifPresentOrElse(
                b -> System.out.println(b),
                () -> System.out.println("該当がありません")
            );
    }
}
