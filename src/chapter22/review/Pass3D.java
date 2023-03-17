package chapter22.review;

import chapter22.RegExpTester;

public class Pass3D {
    public static void main(String[] args) {
        String pattern = "^￥[1-9][0-9]{0,2},[0-9]{3}$";
        String[] ok = {"￥123,456", "￥12,345", "￥1,234" };
        String[] ng = {"123,456", "￥012,345", "￥1,234,567", "￥123", "￥0,123" }; 
        RegExpTester.test(pattern, ok, true);
        RegExpTester.test(pattern, ng, false);
        
    }
}
