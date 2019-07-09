package com.example.laxexamples.dynamicprogramming;
public class Singleton {
static private Singleton instance;

private Singleton() {
}

public static Singleton getFactory() {
    if (instance == null)
        instance = new Singleton();
    return instance;
}

public void doWork(String arg) {
    System.out.println(arg);
}}