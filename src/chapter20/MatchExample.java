package chapter20;

public class MatchExample {
    public static void main(String[] args) {
        var list = PC.getList();

        if (list.stream().anyMatch(pc -> "ARIBAN".equals(pc.name()))) {
            System.out.println("ARIBANという名前のパソコンはあります");
        } else {
            System.out.println("ARIBANという名前のパソコンはありせん");
        }
    }
}
