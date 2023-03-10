package chapter22;

public class Q22_2_2 {
    public static void main(String[] args) {
        String pattern = "^(?!.*\\W)(?=.*\\d).{6,10}$";
        String[] ok = {
            "123456",
            "Ab5c_efLIQ",
        };
        String[] ng = {
            "ab123",
            "kI248##()",
            "yyyyyywwww",
            "abkke3183912"
        };
        test(pattern, ok, true);
        test(pattern, ng, false);
    }

    public static void test(String pattern, String[] targets, boolean ok) {
        System.out.printf("===< %s >===%n", ok ? "OKパターン": "NGパターン");
        int count = 0;
        for (String target: targets) {
            System.out.println(target);
            if (target.matches(pattern)) {
                count++;
            }
        }
        System.out.printf("判定: %d/%d %s%n", 
            count, targets.length, 
            ok ? (count == targets.length ? "合格": "不合格"): (count == 0 ? "合格": "不合格"));
    }
}
