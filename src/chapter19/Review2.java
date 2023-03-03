package chapter19;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Review2 {
    public static void main(String[] args) {
        System.out.println("---< A >---");
        Consumer<Book> c1 = book -> System.out.println(book);
        Book book1 = new Book(2456789, "Jack Rian", 1230);
        c1.accept(book1);

        System.out.println("---< B >---");
        Supplier<String> s1 = () -> "100";
        System.out.println(s1.get());

        System.out.println("---< C >---");
        Predicate<Double> p1 = x -> x > 0;
        System.out.println(p1.test(12.3));
        System.out.println(p1.test(-4.5));

        System.out.println("---< D >---");
        Function<String, Integer> f1 = str -> str.length();
        System.out.println(f1.apply("新わかりやすいJavaオブジェクト指向編徹底解説"));

        System.out.println("---< E >---");
        UnaryOperator<Double> uo = x -> x * x;
        System.out.println(uo.apply(1.4142135623730951));

        System.out.println("---< F >---");
        BiConsumer<String, Integer> bc = (str, index) -> System.out.println(str.charAt(index));
        bc.accept("abcdefghijk", 5);
    }
}
