import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class classB extends classA{
	

	static void incr(int a) { a++; }
	
	public static void main(String[] args)  {

       classA a = new classB();
     
       int[] a1 = { 2, 5};
       incr(a1[0]);
       System.out.println(a1[0]);
       a.print();
       Object o = null;
       int i = 1;
       try {
    	   i++;
    	   throw new Exception();
       }
       catch( Exception ex ) {i++;  }

       
	
	Integer[] arr = new Integer[] { -10, 8, -4, 17, 20, 24, -34, 0, 10};

	Arrays.sort(arr, new Comparator<Integer>() {
		public int compare(Integer o1, Integer o2) {
			return o2.compareTo(o1);
		}
	});
	for (i=0; i < arr.length; i++) {
		System.out.println(arr[i]);;
	}
	
	System.out.println(Arrays.binarySearch(arr, 1));
	
}
}
