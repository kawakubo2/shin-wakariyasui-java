package chapter19;

public record Member(int id, String name) {
    public Member() {
        this(103, "柴田亮");
    }
}
