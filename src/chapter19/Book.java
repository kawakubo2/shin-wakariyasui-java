package chapter19;

public record Book(int code, String title, int price) {
    public Book() {
        this(101, "Java入門", 1000);
    }
}
