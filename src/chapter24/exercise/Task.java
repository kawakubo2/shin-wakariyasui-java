package chapter24.exercise;

public class Task {
    private String msg;
    private static int number = 0;
    public Task(String msg) {
        this.msg = msg;
    }
    synchronized public void doit() {
        // System.out.println(msg);
        /*
         * 1) number
         * 2) number + 1
         * 3) number = number + 1
         */
        number++;
        System.out.printf("%04d\n", number);
        System.out.println(msg);
    }

}
