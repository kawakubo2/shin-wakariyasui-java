package chapter20.review;

public class Q1 {
    public static void main(String[] args) {
        var list = Sales.getList();

        int total = list.stream()
                        .mapToInt(s -> s.quantity() * s.pc().price())
                        .sum();

        System.out.println("売上合計=" + total);

    }
}
