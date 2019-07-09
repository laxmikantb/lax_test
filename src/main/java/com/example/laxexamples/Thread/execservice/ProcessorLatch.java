package com.example.laxexamples.Thread.execservice;

import java.util.concurrent.CountDownLatch;

public class ProcessorLatch implements Runnable {

    private CountDownLatch latch;

    public ProcessorLatch(CountDownLatch latch) {
        this.latch = latch;
    }

    public void run() {
        System.out.println("Started.");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException ignored) {}
        latch.countDown();
    }
}
