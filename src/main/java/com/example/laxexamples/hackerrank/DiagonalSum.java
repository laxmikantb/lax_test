import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiagonalSum {

	   public static void main(String[] args) {
	        ArrayList<List> mlist = new ArrayList<List>();
	        ArrayList<Integer> subList;
	        Scanner in = new Scanner(System.in);
	        int matrixRows = in.nextInt();
	        int maxtrixCols = matrixRows;
	        int i, j;
	        for ( i=0; i < matrixRows; i++) {
	            subList = new ArrayList<Integer>();
	            for (j=0; j< matrixRows; j++ ){
	                subList.add(in.nextInt());
	            }
	            mlist.add(subList);
	        }        
	        
	        int diff = getDiagonalDiff(mlist);
	        System.out.println(diff);
	    }
	    
	    static int getDiagonalDiff(ArrayList<List> matrix) {
	        int firstdigonalSum = 0;
	        int seconddigonalSum = 0;
	        int[][] multD = new int[matrix.size()][matrix.size()];
	        for (int i=0;  i < matrix.size(); i++)
	        {
	        	ArrayList<Integer> list = (ArrayList<Integer>) matrix.get(i);
	        	for (int j=0; j < matrix.size(); j++) {
	        		multD[i][j] = list.get(j);
	        	}
	        }
	        for (int i=0, j=0;  i < matrix.size(); i++,j++)
	        {
	        	firstdigonalSum += multD[i][j];
	        }
	        
	        for (int i=matrix.size()-1, j=0;  i >= 0; i--,j++)
	        {
	        	seconddigonalSum += multD[i][j];
	        }
	        
	       return Math.abs(firstdigonalSum - seconddigonalSum); 
	    }
	
}
