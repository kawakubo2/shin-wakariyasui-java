package chapter20;

public class FilterExample {
    public static void main(String[] args) {
        var list = PC.getList();
        list.stream()
            .filter(pc -> "Panan".equals(pc.maker()))
            .forEach(System.out::println);
    }
}
