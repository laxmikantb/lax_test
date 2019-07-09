
public class DavisSteps {
	public static int countPaths(int steps) {
		if (steps < 0)
			return 0;
		if (steps == 0)
			return 1;
		return countPaths(steps -1) + countPaths(steps -2) + countPaths(steps -3); 
	}
	
	public static int countPathMemo(int steps)
	{
		if (steps < 0)
			return 0;
		return countPathMemo(steps, new int[steps + 1]);
	}

	private static int countPathMemo(int steps, int[] memo) {
		if (steps < 0)
			return 0;
		if (steps == 0) 
			return 1;
		if (memo[steps] == 0) { 
			memo[steps] =  countPathMemo(steps -1, memo) + countPathMemo(steps -2, memo) + countPathMemo(steps -3, memo) ;
		}
	 return memo[steps];
	}
	
	private static int countPathDP(int steps) {
		if (steps < 0)
			return 0;
		if (steps <= 1) 
			return 1;
		int[] paths = new int[steps + 1];
		paths[0] = 1;
		paths[1] = 1;
		paths[2] = 2;
		
		for (int i=3; i <= steps; i++) {
			paths[i] = paths[ i -1] + paths[i -2] + paths[i -3];
		}
		return paths[steps];
	}
	
	private static int countPathI(int steps) {
		if (steps < 0)
			return 0;
		if (steps <= 1) 
			return 1;
		int[] paths = {1, 1, 2};

		
		for (int i=3; i <= steps; i++) {
			int count = paths[2] + paths[1] + paths[0];
		}
		return paths[steps];
	}
}
