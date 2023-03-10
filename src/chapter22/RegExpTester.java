package chapter22;

public class RegExpTester {
    public static void test(String pattern, String[] targets, boolean ok) {
        System.out.printf("===< %s >===%n", ok ? "OKパターン": "NGパターン");
        int count = 0;
        for (String target: targets) {
            System.out.print(target + ": ");
            if (target.matches(pattern)) {
                System.out.println("○");
                count++;
            } else {
                System.out.println("×");
            }
        }
        System.out.printf("判定: %d/%d %s%n", 
            count, targets.length, 
            ok ? (count == targets.length ? "合格": "不合格"): (count == 0 ? "合格": "不合格"));
    }
}
