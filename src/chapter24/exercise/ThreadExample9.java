package chapter24.exercise;

public class ThreadExample9 {
    public static void main(String[] args) {
        for (int i = 0; i < 500; i++) {
            Thread t1 = new Thread(() -> {
                Task task = new Task("thread-1");
                task.doit();
            });
            Thread t2 = new Thread(() -> {
                Task task = new Task("thread-2");
                task.doit();
            });
            Thread t3 = new Thread(() -> {
                Task task = new Task("thread-3");
                task.doit();
            });

            t1.start();
            t2.start();
            t3.start();
        }
    }
}
