package chapter20.review;

public class Q5 {
    public static void main(String[] args) {
        var list = Sales.getList();

        int total = list.stream()
            .filter(s -> "DELO".equals(s.pc().maker()))
            .mapToInt(s -> s.quantity() * s.pc().price())
            .sum();

        System.out.println("DELO製パソコンの売上総額=" + total);
    }
}
