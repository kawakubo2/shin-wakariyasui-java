package chapter20.review;

public class Q4 {
    public static void main(String[] args) {
        var list = Sales.getList();

        long count = list.stream()
                            .filter(s -> s.quantity() * s.pc().price() >= 100_000)
                            .count();
        System.out.println("10万円以上の取引件数=" + count);
    }
}
