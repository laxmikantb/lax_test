import java.util.Scanner;

public class StairCaseDraw {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        StringBuffer sb = new StringBuffer();
        int staircase = 0;
        for (staircase=1; staircase <= size; staircase++)
        {
        	for (int i=0; i < size-staircase; i++) 
        		sb.append(" ");
        	for (int j=0; j < staircase; j++) 
        		sb.append("#");
        	System.out.println(sb.toString());
        	sb = new StringBuffer();
        	
        }

	}
}
