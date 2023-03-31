package chapter24;

public class ThreadExample2 {
    public static void main(String[] args) {
        for (int i = 0; i < 500; i++) {
                Thread t1 = new Thread(() -> {
                    Task task = new Task("thread-1");
                task.doit();
            });
            t1.start();
            System.out.println("--- main 終了 ---");
        }
    }
}
