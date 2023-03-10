package chapter22;

import java.util.regex.Pattern;

public class StringMatchesTest {
    public static void main(String[] args) {
        String str = "私の会社の郵便番号は812-0013です。";
        String p = ".*?[0-9]{3}-[0-9]{4}.*?";
        if (str.matches(p)) {
            System.out.println("○");
        } else {
            System.out.println("×");
        }
    }
}
