import java.util.ArrayList;
import java.util.List;

public class FindMinMaxDemo {
	public static class MinMax {
		public Integer min;
		public Integer max;
		
		public MinMax(Integer min, Integer max) {
			this.max = max;
			this.min = min;
		}
		
		public static MinMax minMax(Integer a, Integer b) {
			return Integer.compare(b, a) < 0 ? new MinMax(b, a) : new MinMax(a, b);
		}
	}
	
	public static MinMax findMinMax(List<Integer> arr ){
		if (arr.size() <=1) {
			return new MinMax(arr.get(0), arr.get(0));
		}
		
		MinMax globalMinMax = MinMax.minMax(arr.get(0), arr.get(1));
		for (int i=2; i+1 < arr.size(); i+=2){ // compare two at a time
			MinMax temp = MinMax.minMax(arr.get(i), arr.get(i+1));
			globalMinMax = new MinMax(Math.min(globalMinMax.min, temp.min ), Math.max(globalMinMax.max, temp.max));
		}
		
		if ((arr.size() %2) !=0) { // odd size
			 globalMinMax = new MinMax(Math.min(globalMinMax.min, arr.get(arr.size())), Math.max(globalMinMax.max, arr.get(arr.size())));
		}
		return globalMinMax;
	}
	
	public static void main(String args) {
		ArrayList arr  = new ArrayList(); // {1,-18,-5,3,5,7,8,9,0, 10, 20, -15, -14 };
		MinMax m = findMinMax(arr);
	}
}
