package chapter22;

public class StringCodePointsTest {
    public static void main(String[] args) {
        String name = "川久保智晴";
        name.codePoints().forEach(System.out::println);
    }
}
