package chapter22;

public class StringEqualsTest {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "JavaScript";
        System.out.println(equals(s1, s2.substring(0, 4)));
    }
    public static boolean equals(String s1, String s2) {
        return s1 == s2;
        // "xxx".equals(s1)
    }
}
