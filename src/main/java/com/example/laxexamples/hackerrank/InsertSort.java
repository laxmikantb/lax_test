
public class InsertSort {
	// worst case o n^2
	// best o(n) already partially sorted

	public static void sort(int arr[]) {
		int n = arr.length;
		int key;
		for (int i=1; i < n; i++) {
			key =  arr[i];
			int j = i-1;
			while (j>=0 && arr[j] > key){
				arr[j+1] = arr[j];
				j=j-1;
			}
			arr[j+1] = key;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
