package chapter22.review;

import chapter22.RegExpTester;

public class Pass4 {
    public static void main(String[] args) {
        // String pattern = "^(?=.*[0-9]+)(?=.*[a-z]+)(?=.*[A-Z]+)(?!.*\\s+)(?!.*\\W).{6,10}$";
        String pattern = "^(?=.*[0-9]+)(?=.*[a-z]+)(?=.*[A-Z]+)(?!.*\\W).{6,10}$";
        String[] ok = {"a1B234c", "xYz123", "123xyZ", "ABC1x2y3z4"};
        String[] ng = {"PQ1ab", "abc123", "4A5B6C", "123456", "ABCDEF", "abcdef",
            "Ab1 Xy2", " Ab1Xy2", "LMn123 ", "C1DE#fg2", "あいうAb1"};
        RegExpTester.test(pattern, ok, true);
        RegExpTester.test(pattern, ng, false);
        
    }
    
}
