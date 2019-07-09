package com.example.laxexamples.Thread.execservice;

interface  Test
{
    public void show1();
    public void show2();
}

public class AnonymousInnerDemo {
    public static  void main(String args[])
    {
  
        new Test(){
            public void show1() {
                System.out.println("show1()");
            }
            public void show2() {
                System.out.println("show2()");
            }
        }.show2();
    }//main
}//clas