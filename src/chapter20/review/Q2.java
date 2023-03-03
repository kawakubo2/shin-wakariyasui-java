package chapter20.review;

public class Q2 {
    public static void main(String[] args) {
        var list = Sales.getList();

        int total = list.stream()
                    .filter(s -> "東京".equals(s.office()))
                    .mapToInt(s -> s.quantity() * s.pc().price())
                    .sum();

        System.out.println("東京支社の売上合計=" + total);
    }
}
