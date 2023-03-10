package chapter22;

public class ReplaceAllExample {
    public static void main(String[] args) {
        String str = "<title>サンプル</title>";
        System.out.println(str.replaceAll("<.+?>", ""));
    }
}
