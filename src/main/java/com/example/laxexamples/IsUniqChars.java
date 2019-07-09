
public class IsUniqChars {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Checking");
		System.out.println(IsUniqueChars("ABCDSEESS"));
	}
	
	public static boolean IsUniqueChars(String a)
	{
		boolean[] char_set = new boolean[128];
		for (int i=0; i < a.length(); i++) {
			int val = a.charAt(i);
			if (char_set[val])
			{
				return false;
			}
			char_set[val] = true;
		}
		return true;
		
	}

}
