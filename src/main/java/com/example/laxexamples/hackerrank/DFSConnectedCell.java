import java.util.Scanner;

public class DFSConnectedCell {
	/*
	 * 0 0 1 1 0
	 * 0 1 0 1 0
	 * 0 1 0 0 0
	 * 0 0 0 0 0
	 * 
	 * output 4
	 */
	
	public static int getBiggestRegion(int[][] matrix) {
		int maxRegion = 0;

		for (int row =0; row < matrix.length; row++) {
			for (int col =0; col < matrix[row].length;  col++) {
				if (matrix[row][col] == 1) {
					int size = getRegionSize(matrix, row, col);
					maxRegion = Math.max(size, maxRegion);
				}
			}
		}
		return maxRegion;
	}

	private static int getRegionSize(int[][] matrix, int row, int col) {
		if (row < 0 || col < 0 || row >= matrix.length || col >= matrix[row].length)
			return 0;
		if (matrix[row][col] == 0){
			return 0;
		}
		matrix[row][col] = 0; // initialize zero to protect not to visit again
		int size =1;
		// traverse up/down/diagonal
		for (int r = row-1; r <=row+1; r++) {
			for (int c = col -1; c <= col + 1; c++) {
				if (r != row || c != col) {
					size += getRegionSize(matrix, r, c);
				}
			}
		}
		return size;
	}
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int grid[][] = new int[n][m];
        for(int grid_i=0; grid_i < n; grid_i++){
            for(int grid_j=0; grid_j < m; grid_j++){
                grid[grid_i][grid_j] = in.nextInt();
            }
        }
        System.out.println(getBiggestRegion(grid));
    }

}
