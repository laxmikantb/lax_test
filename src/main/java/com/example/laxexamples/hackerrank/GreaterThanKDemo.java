import java.util.ArrayList;
import java.util.List;

public class GreaterThanKDemo {

	public static int searchFirstLargerOfK(List<Integer> list, int k) {
	   int left =0, right = list.size() -1, result =-1;
	   while (left <= right)
	   {
		   int mid = ((right + left) /2);
		   if (list.get(mid) > k) {
			   result = mid;
			   right = mid -1;
		   }
		   else {
			   left = mid + 1;
		   }
	   }
	   return result;
	}
	
	public static void main(String[] args) {
		 int[] arr = {  103, 203, 220, 234, 279, 368, 378, 478, 550, 631 };
		 ArrayList<Integer> list = new ArrayList<Integer>();
		 for (int i=0; i < arr.length; i++)
			 list.add(arr[i]);
		 
		   System.out.println(searchFirstLargerOfK(list, 370));


	}

}
