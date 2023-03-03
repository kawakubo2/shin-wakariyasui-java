package chapter20;

public class ReduceExample {
    public static void main(String[] args) {
        var list = PC.getList();
        // Optional<String> name = list.stream()
        //         .map(PC::name)
        //         .reduce((a, b) -> a + ", " + b);

        // System.out.println(name.get());
        String name = list.stream()
                .map(PC::name)
                .reduce("", (a, b) -> a + ", " + b);

        System.out.println(name);
    }
}
