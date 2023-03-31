package chapter24;

import java.util.Random;
import java.util.concurrent.CompletableFuture;

public class Example4 {
    public static void main(String[] args) throws Exception {
        CompletableFuture.supplyAsync(() -> {
                Random r = new Random();
                if (r.nextBoolean()) {
                    throw new RuntimeException("combineする前");
                }
                return "Value";
            })
            .thenCompose(result -> CompletableFuture.supplyAsync(() -> {
                Random r = new Random();
                if (r.nextBoolean()) {
                    throw new RuntimeException("combine中");
                }
                return "★" + result;
            }))
            .whenComplete((ret, err) -> {
                if (err == null) {
                    System.out.println(ret + "★");
                } else {
                    System.out.println("エラーです。" + err.getMessage());
                }
            });
        //System.out.println(future.get());
    }
}
