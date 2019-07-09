package com.example.laxexamples.dynamicprogramming;
import java.util.concurrent.atomic.AtomicInteger;

public class VolatileTest {
    private static volatile int MY_INT = 0;
    private static volatile AtomicInteger count = new AtomicInteger(0);

    public static void main(String[] args) {
        new ChangeListener().start();
        new ChangeMaker().start();
    }

    static class ChangeListener extends Thread {
        @Override
        public void run() {
        	synchronized(this) {
            int local_value = MY_INT;
            while ( local_value < 20){
                if( local_value!= MY_INT){
                	local_value= MY_INT;
                	MY_INT++;
                	count.incrementAndGet();
                	System.out.println("ChangeListener MY_INT " + local_value + " incremented " + MY_INT + " count " + count.get());
                     local_value= MY_INT;
                }
            }
        	}
        }
    }

    static class ChangeMaker extends Thread{
        @Override
        public void run() {
        	synchronized(this) {
            int local_value = MY_INT;
            while (MY_INT <20){
            	local_value= MY_INT;
            	MY_INT++;
            	count.incrementAndGet();
                System.out.println("Incrementing MY_INT " + local_value + " incremented " + MY_INT + " count " + count.get());
                MY_INT++;
//                try {
//                    Thread.sleep(1);
//                } catch (InterruptedException e) { e.printStackTrace(); }
            }
        	}
        }
    }
}