import java.util.Scanner;
import java.util.Stack;

public class QueueWithTwoStack {

	public static class MyQueue<T> {

	    private Stack<T> inputStack;      // for enqueue
	    private Stack<T> outputStack;     // for dequeue
	    private int size;

	    public MyQueue() {
	        inputStack = new Stack<>();
	        outputStack = new Stack<>();
	    }

	    public void enqueue(T e) {
	        inputStack.push(e);
	        size++;
	    }

	    public T dequeue() {
	        if(outputStack.isEmpty())
	            while(!inputStack.isEmpty())
	                outputStack.push(inputStack.pop());

	        T temp = null;
	        if(!outputStack.isEmpty()) {
	            temp = outputStack.pop();
	            size--;
	        }

	        return temp;
	    }

	    public T peek() {
	        if(outputStack.isEmpty())
	            while(!inputStack.isEmpty())
	                outputStack.push(inputStack.pop());

	        T temp = null;
	        if(!outputStack.isEmpty()) {
	            temp = outputStack.firstElement();
	        }

	        return temp;
	    }
	    
	    public int size() {
	        return size;
	    }

	    public boolean isEmpty() {
	        return size == 0;
	    }
	}
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt();
        while(t-- > 0) {     
            int query = scanner.nextInt();
            switch(query) {
            	case 1:
            		int n = scanner.nextInt();
            		queue.enqueue(n);
            		break;
            	case 2:
            		queue.dequeue();
            		break;
            	case 3:
            		System.out.println(queue.peek());
            		break;
            }
        }
//        // enqueue integers 1..3
//        for(int i = 1; i <= 3; i++)
//            queue.enqueue(i);
//
//        // execute 2 dequeue operations 
//        for(int i = 0; i < 2; i++)
//            System.out.println("Dequeued: " + queue.dequeue());
//
//        // enqueue integers 4..5
//        for(int i = 4; i <= 5; i++)
//            queue.enqueue(i);
//
//        // dequeue the rest
//        while(!queue.isEmpty())
//            System.out.println("Dequeued: " + queue.dequeue());
    }

}
