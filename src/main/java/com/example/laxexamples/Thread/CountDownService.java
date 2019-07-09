package com.example.laxexamples.Thread;

import java.util.concurrent.CountDownLatch;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
  * Service class which will be executed by Thread using CountDownLatch synchronizer.
  */
 public class CountDownService implements Runnable{
    private final String name;
     private final int timeToStart;
     private final CountDownLatch latch;
   
    public CountDownService(String name, int timeToStart, CountDownLatch latch){
        this.name = name;
        this.timeToStart = timeToStart;
        this.latch = latch;
    }
  
    @Override
    public void run(){
        try {
             Thread.sleep(timeToStart);
        } catch (InterruptedException ex) {
            Logger.getLogger(CountDownService.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println( name + " is Up");
         latch.countDown(); //reduce count of CountDownLatch by 1
    }
   
}
