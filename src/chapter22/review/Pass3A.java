package chapter22.review;

import chapter22.RegExpTester;

public class Pass3A {
    public static void main(String[] args) {
        String pattern = "^[a-zA-Z].{1,9}$";
        String[] ok = {"a00143", "Bbb1-23", "xxx999", "a b c d e "};
        String[] ng = {"A2345678901", "1Abljkje", "A"};
        RegExpTester.test(pattern, ok, true);
        RegExpTester.test(pattern, ng, false);
    }
}
