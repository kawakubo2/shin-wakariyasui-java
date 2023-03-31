package chapter24;

import java.util.concurrent.TimeUnit;

public class Task {
    private String msg;
    public Task(String msg) {
        this.msg = msg;
    }
    public void doit() {
        System.out.println(msg);
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch(InterruptedException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
