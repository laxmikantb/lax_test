import java.util.PriorityQueue;
import java.util.TreeSet;

public class Demo {

	public static void main(String[] args)  {
		PriorityQueue q = new PriorityQueue();
		System.out.println(q.peek()); // null
		//System.out.println(q.element()); //RunTime Exception NoSuchElementException
		for (int i=0; i< 10; i++) {
			q.offer(i);
			
		}
		q.offer(1);
		q.offer(10);
		q.offer(8);
		q.offer(9);
		q.offer(11);
		q.offer(4);
		q.offer(2);
		System.out.println(q); // [0,1,2,3,4,5,6,7,8,9]
//		System.out.println(q.poll()); // 0
//		System.out.println(q); // [1,2,3,4,5,6,7,8,9]
		
		PriorityQueue q1 = new PriorityQueue(15, new MyComparator());
		q1.offer(1);
		q1.offer(10);
		q1.offer(8);
		q1.offer(9);
		q1.offer(11);
		q1.offer(4);
		System.out.println(q1);
		

	}

}
