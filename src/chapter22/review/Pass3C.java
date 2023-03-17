package chapter22.review;

import chapter22.RegExpTester;

public class Pass3C {
    public static void main(String[] args) {
        String pattern = "^[ ]*[a-z]+[ ]*$";
        String[] ok = {"a", "as", "soon", "b", "kubernetes", "  javascript",
            "python ", " django "};
        String[] ng = {"big foot", "imperatively1", "2declaratively", 
            "c-sharp", "Java"};
        RegExpTester.test(pattern, ok, true);
        RegExpTester.test(pattern, ng, false);
        
    }
}
