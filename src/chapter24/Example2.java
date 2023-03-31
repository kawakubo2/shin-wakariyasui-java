package chapter24;

import java.util.concurrent.CompletableFuture;

public class Example2 {
    public static void main(String[] args) throws Exception {
        //CompletableFuture<Void> future
        CompletableFuture
                .supplyAsync(() -> "Value")
                .thenApply(result -> "★" + result)
                .thenAccept(result -> System.out.println(result + "☆")); 
    }
}
