import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnticlockMatrixRotate {
	  public static void main(String[] args) {
	      /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	      BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

	      String[] line = new String[3];
	      try {
	          line = buf.readLine().split(" ");
	      } catch (IOException ex) {
	          ex.printStackTrace();
	      }
	      int m = Integer.parseInt(line[0]);
	      int n = Integer.parseInt(line[1]);
	      int num_rotations = Integer.parseInt(line[2]);

	      int[][] matrix = new int[m][n];
	      
	      for (int i = 0; i < m; ++i) {
	          line = new String[n];
	          try {
	              line = buf.readLine().split(" ");
	          } catch (IOException ex) {
	              ex.printStackTrace();
	          }
	          for (int j = 0; j < n; ++j) {
	              matrix[i][j] = Integer.parseInt(line[j]);
	          }
	      } 
	      
	      //System.out.println(Arrays.deepToString(matrix));
	      
	      int[][] results = rotate(matrix, 1);

	      //System.out.println(Arrays.deepToString(matrix));
	      
	      printMatrix(results);
	  }
	    
	  private static int[][] rotate(int[][] input, int num_rotations) {
	      int[][] output = input;
	      int n = input[0].length;
	      int m = input.length;
	      
	      for (int r = 0; r < num_rotations; ++r) {
	          for (int row = 0; row < n; ++row) { // n = col nums
	              for (int col = 0; col < m; ++col) { //  m = row nums 
	                  if (col == row && row < (n/2)) { // if its a diagonal and first half of matrix
	                      output[col][row] = input[col][row+1]; 
	                  } else if (col == row && row >= (n/2)) { // if its diagonal and the second half of the matrix
	                      output[col][row] = input[col][row-1];
	                  } else if ((col == (m-row-1)) && row >= (n/2)) { // if its reverse diagonal first half
	                      output[col][row] = input[col+1][row];
	                  //} else if ((col == (m-row-1))) { // if its reverse diagonal second half
	                  //   output[col][row] = input[col-1][row];
	                  }
	              }
	          }
	      }
	      
	      return output;
	  }
	    
	  private static void printMatrix(int[][] matrix) {
	    for (int row = 0; row < matrix.length; row++) {
	        for (int col = 0; col < matrix[row].length; col++) {
	            System.out.printf("%4d", matrix[row][col]);
	        }
	        System.out.println();
	    }
	  }
}
