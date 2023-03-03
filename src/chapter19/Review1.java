package chapter19;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public class Review1 {
    public static void main(String[] args) {
        System.out.println("---< A >---");
        Supplier<Book> s = () -> new Book();
        Book b = s.get();
        System.out.println(b);

        System.out.println("---< B >---");
        Predicate<String> p = str -> str.length() == 0;
        System.out.println(p.test(""));
        System.out.println(p.test("abc"));
        
        System.out.println("---< C >---");
        Consumer<Member> c = member -> System.out.println(member.name());
        Member m = new Member(102, "星山裕子");
        c.accept(m);

        System.out.println("---< D >---");
        ToIntFunction<Book> t = book -> book.price();
        Book b2 = new Book(1234567, "SPY Family", 500);
        System.out.println(t.applyAsInt(b2));
        
        System.out.println("---< E >---");
        BinaryOperator<String> bo = (s1, s2) -> s1 + s2;
        System.out.println(bo.apply("Java", "Script"));
    }
}
