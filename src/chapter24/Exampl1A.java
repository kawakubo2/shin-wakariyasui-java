package chapter24;

import java.util.concurrent.CompletableFuture;

public class Exampl1A {
    public static void main(String[] args) throws Exception {
        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> 1);
        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> 10);
        CompletableFuture<Integer> future3 = CompletableFuture.supplyAsync(() -> 100);

        System.out.println(future1.get() + future2.get() + future3.get());
    }
}
