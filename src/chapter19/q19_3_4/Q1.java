package chapter19.q19_3_4;

import java.util.function.BiFunction;
import java.util.function.Supplier;

import chapter19.Member;

public class Q1 {
    public static void main(String[] args) {
        Supplier<Member> s = Member::new;
        Member m = s.get();
        System.out.println(m);

        int n = 102;
        String name = "鈴木一郎";
        BiFunction<Integer, String, Member> bf = Member::new;
        Member m2 = bf.apply(n, name);
        System.out.println(m2);
    }    
}
