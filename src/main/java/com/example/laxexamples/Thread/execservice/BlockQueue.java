package com.example.laxexamples.Thread.execservice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BlockQueue {
    private Queue<String> queue = new LinkedList<>();
    private int capacity;
    private Lock lock = new ReentrantLock();
    //condition variables
    private Condition notFull = lock.newCondition();
    private Condition notEmpty = lock.newCondition();
    
    public BlockQueue(int capacity) {
    	this.capacity = capacity;
    }
    
    public void put(String element) throws InterruptedException {
    	lock.lock();
    	try {
    		while(queue.size()==capacity) {
    			System.out.println("Queue is full cannot put any more item");
    			notFull.await(); // releases lock
    		}
    		queue.add(element);
    		System.out.println("Added item to queue " + element);
    		notEmpty.signal(); // calls waiting thread on same object
    	}
    	finally {
    		lock.unlock();
    	}
    }

    public void consume() throws InterruptedException {
    	lock.lock();
    	try {
    		while(queue.isEmpty()) {
    			System.out.println("Queue is empty cannot consume any more item");
    			notEmpty.await(); // releases lock
    		}
    		String item = queue.remove();
    		System.out.println("Cosumed item from queue " + item);
    		notFull.signal(); // calls waiting thread on same object
    	}
    	finally {
    		lock.unlock();
    	}
    }

}
