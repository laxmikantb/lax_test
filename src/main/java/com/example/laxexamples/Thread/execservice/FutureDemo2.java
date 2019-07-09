package com.example.laxexamples.Thread.execservice;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class FutureDemo2 {

    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> list = new ArrayList<>();
        ExecutorService executor = Executors.newCachedThreadPool();
        Future<Integer> future;

        for (int i = 1; i < 10; i++) {
            future = executor.submit(new MyCallable(i));
            try {
                list.add(future.get());
            } catch (ExecutionException ex) {
                System.out.println(ex.getMessage());
            }
        }

        executor.shutdown();
        //this is ont necessary in this case .. but .. good practice :)
        executor.awaitTermination(1, TimeUnit.DAYS);

        for (int i = 0; i < list.size(); i++) {
            //get returned values from call()
            System.out.println("List Values " + i + " Value: " + list.get(i));

        }
    }

}
