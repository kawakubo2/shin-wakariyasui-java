package chapter20;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        var list = PC.getList();

        Optional<PC> anyPc = list.stream()
                                .filter(pc -> "Panen".equals(pc.maker()))
                                .findAny();
        anyPc.ifPresentOrElse(
            pc -> System.out.println(pc.name()), 
            () -> System.out.println("該当がありません"));                
    }
}
