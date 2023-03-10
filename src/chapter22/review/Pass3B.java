package chapter22.review;

import chapter22.RegExpTester;

public class Pass3B {
    public static void main(String[] args) {
        String pattern = "^[a-z]{3}-\\d+$";
        String[] ok = {"abc-1", "abc-12", "xxx-12345678"};
        String[] ng = {"abcd-1", "a1c-1", "yyy-", "Abc-123"};
        RegExpTester.test(pattern, ok, true);
        RegExpTester.test(pattern, ng, false);
    }
    
}
