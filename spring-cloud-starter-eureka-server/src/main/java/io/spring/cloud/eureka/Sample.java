package io.spring.cloud.eureka;

import java.util.concurrent.CompletableFuture;

public class Sample {

    public static void main(String[] args) {
        CompletableFuture.runAsync(()-> System.out.println("Run async in completable future"+ Thread.currentThread()));
    }
}
