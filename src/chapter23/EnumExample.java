package chapter23;

import java.util.Arrays;
import java.util.List;

public class EnumExample {
    public static void main(String[] args) {
        List<SmartPhone> list = Arrays.asList(
            new SmartPhone("100", Color.WHITE),
            new SmartPhone("101", Color.BLACK),
            new SmartPhone("102", Color.BLACK),
            new SmartPhone("103", Color.GOLD)
        );
        list.forEach(System.out::println);
        System.out.println(Color.BLACK.ordinal());
        System.out.println(Color.WHITE.ordinal());
        System.out.println(Color.GOLD.ordinal());

        for (Color color: Color.values()) {
            System.out.printf("%2d: %s  ", (color.ordinal() + 1), color.name());
        }
        System.out.println();
    }
}
