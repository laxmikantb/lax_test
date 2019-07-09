import java.util.Scanner;
import java.util.Stack;

public class StackMaxElement {
	Stack<Integer> mainStack = new Stack<Integer>();
	Stack<Integer> maxIntStack = new Stack<Integer>();
	
	public static void main(String[] args) {
		StackMaxElement solution = new StackMaxElement();
        Scanner in = new Scanner(System.in);
        int numberofQueries = in.nextInt();
        int queryType;
        int value;
        while (numberofQueries > 1)
        {
        	//System.out.println(numberofQueries);
        	queryType = in.nextInt();
        	switch(queryType)
        	{
        	case 1: 
        		value = in.nextInt();
        		solution.push(value);
        		numberofQueries--;
        		break;
        	case 2:
        		solution.pop();
        		numberofQueries--;
        		break;
        	case 3:
        		System.out.println(solution.max());
        		numberofQueries--;
        	default:
        		break;       	
        	}
        }
        
//		solution.push(97);
//		solution.pop();
//		solution.push(20);
//		solution.pop();
//		solution.push(26);
//		solution.push(20);
//		solution.pop();
//		System.out.println(solution.max());
//		solution.push(91);
//		System.out.println(solution.max());
//		solution.push(90);
//		System.out.println(solution.max());
	}
	
	public void push(int value) {
		if (value >= max()){
			maxIntStack.push(value);
		}
		mainStack.push(value);
	}
	
	public Integer pop()
	{
		int value = mainStack.pop();
		if (value == max())
			maxIntStack.pop();
	     return value;
	}
	
	public int max() {
		if (maxIntStack.isEmpty())
			return Integer.MIN_VALUE;
		else
			return maxIntStack.peek();
	}

}
