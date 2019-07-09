import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HourGlass {

	private static final int SIZE = 6; // size of matrix
    private static final int HOURGLASS_SIZE = 2; // hourglass width
    private static int matrix[][] =  new int[SIZE][SIZE];    
    private static int maxSum = -100; // Lowest possible sum 

    
    private ArrayList<List> getHourglass(int i, int j){
    	ArrayList<List> rows = new ArrayList<List>();
    	ArrayList<Integer> columns = new ArrayList<Integer>();
    	for (int row=0; row < 3; row++) {
    		rows.add(new ArrayList<Integer>());
    	}

    	int middleRow = i+1;
    	int middleColumn = j+1;
    	int k =0;
        for(k = j; k <= j + HOURGLASS_SIZE; k++){
        	rows.get(0).add(matrix[i][k]); // top row
        	rows.get(HOURGLASS_SIZE).add(matrix[i + HOURGLASS_SIZE][k]); // bottom row
        }
        // middle element
        rows.get(1).add(0);
        rows.get(1).add(matrix[i + 1][j + 1]); // middle element
        rows.get(1).add(0);
        
     return rows;   
    }
    

    private static int getMaxSum(ArrayList<List<List>> hgList){

    	int sum = 0;
        for (int i=0; i < hgList.size(); i++) {
        	ArrayList<List> row = (ArrayList<List>)hgList.get(i);
        	sum = 0;
        	for (int j=0; j < row.size(); j++) {
        		ArrayList<Integer> columns = (ArrayList<Integer>)row.get(j);
        		for (int column=0; column < columns.size(); column++) {
        			sum += columns.get(column);
        		}
        	}
        	if(maxSum < sum)
        	{
        		maxSum = sum;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        for(int i=0; i < SIZE; i++){
            for(int j=0; j < SIZE; j++){
                matrix[i][j] = scan.nextInt();
            }
        }
        scan.close();
        
		
        ArrayList<List<List>> hourGlassList = new ArrayList<List<List>>();
        HourGlass solution = new HourGlass();
        // generate hourglasses
        for(int i=0; i < SIZE - HOURGLASS_SIZE; i++){
            for(int j=0; j < SIZE - HOURGLASS_SIZE; j++){
            	hourGlassList.add(solution.getHourglass(i, j));
            }
        }
       
        System.out.println(getMaxSum(hourGlassList));
    }

}
