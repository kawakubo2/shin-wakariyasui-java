package chapter24;

import chapter24.exercise.Task;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Q2402 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(10);
        es.execute(() -> {
            Task task = new Task("thread-1");
            task.doit();
        });
        es.execute(() -> {
            Task task = new Task("thread-2");
            task.doit();
        });
        es.execute(() -> {
            Task task = new Task("thread-3");
            task.doit();
        });
        es.shutdown();
    }
}
