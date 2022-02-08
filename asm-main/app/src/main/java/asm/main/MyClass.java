package asm.main;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyClass {

    public Future<String> calculateAsync() {
        CompletableFuture<String> completableFuture = new CompletableFuture<>();

        Executors.newCachedThreadPool().submit(() -> {

                    Thread.sleep(500);
                    completableFuture.complete("Hello");
                    return null;
                }
        );

        return completableFuture;
    }
}
