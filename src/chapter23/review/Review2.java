package chapter23.review;

public class Review2 {
    public static void main(String[] args) {
        var list = Book.getList();
        list.stream()
            .filter(b -> b.genre() == Genre.SCIENCE)
            .map(Book::title)
            .forEach(System.out::println);
    }
}
