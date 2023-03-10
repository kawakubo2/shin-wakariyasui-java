package chapter22;

public class StringJoinTest {
    public static void main(String[] args) {
        String[] a1 = {"Sun flower", "Tulip", "Morning Glory"};
        String[] a2 = {"Banana", "Grape", "Pine apple"};
        String[] a3 = {"Java", "Python", "C++", "PHP"};

        String result = String.join(",", a1);
        System.out.println(result);
    }
}
