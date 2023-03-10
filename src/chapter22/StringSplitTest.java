package chapter22;

import java.util.Arrays;

public class StringSplitTest {
    public static void main(String[] args) {
        String[] dates = {"2023-03-03", "2023/03/03", "2023.03.03"};
        for (String dateStr: dates) {
            System.out.println(Arrays.toString(convertIntArray(dateStr)));
        }    
    }
    public static int[] convertIntArray(String dateStr) {
        return Arrays.stream(dateStr.split("[/.-]"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
    }
}
