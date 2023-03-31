package chapter22;

import lib.Input;

public class Q22_3 {
    public static void main(String[] args) {
        String item = Input.getString("製品番号");
        if (!item.matches("^(?=.*[A-Z0-9])(?!.*\\W).{4,6}")) {
            System.out.println(item);
        }
    }
}
