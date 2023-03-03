package chapter19;

public record Student(int id, String name) {
    public Student() {
        this(100, "田中宏");
    }
}
