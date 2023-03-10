package chapter22;

import java.util.Arrays;

public class SplitExample2 {
    public static void main(String[] args) {
        String dt = "100 ,　　田中宏		      ,  60.5";
        String[] dts = dt.split("\\s*,\\s*");
        Arrays.stream(dts).forEach(s -> System.out.println(">" + s + "<"));
    }
}
