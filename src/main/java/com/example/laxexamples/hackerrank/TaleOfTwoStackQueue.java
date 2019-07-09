
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TaleOfTwoStackQueue {
    public static class Queue<T> extends ArrayDeque<T>{
    public void enqueue(T x)
    {
        super.addLast(x);
    }
    
    public T dequeue() {
        return super.pollFirst();
    }
    
    public T peek() {
        return super.peek();
    }
}
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
              queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
              queue.dequeue();
            } else if (operation == 3) { // print/peek
              System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}