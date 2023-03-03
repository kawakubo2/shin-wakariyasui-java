package chapter20;

import java.util.Optional;

public class FindExample {
    public static void main(String[] args) {
        var list = PC.getList();
        PC nonePC = new PC("No-exsits", "NONE", -1, "No-exists");

        Optional<PC> anyPc = list.stream()
                                .filter(pc -> "Panan".equals(pc.maker()))
                                .findAny();
        System.out.println(anyPc.orElse(nonePC).name());

        
    }
}
