package com.example.laxexamples.Thread.execservice;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    int value;

    public MyCallable(int i) {
        this.value = i;
    }

    @Override
    public Integer call() throws Exception {
        Integer sum = 0;
        for (int i = 0; i < value; i++) {
            sum += i;
        }
        System.out.println("Sum in Callable.Call() " + sum);
        return sum;
    }
}
