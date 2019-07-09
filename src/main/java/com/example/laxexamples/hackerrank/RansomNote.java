import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.StringTokenizer;


public class RansomNote {
    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;
    
    public RansomNote(String magazine, String note) {
        magazineMap = new HashMap<String, Integer>();
        noteMap = new HashMap<String, Integer>();
        
    	StringTokenizer st = new StringTokenizer(magazine);
    	String token = null;
    	int value;
		while (st.hasMoreElements()) {
			token = (String) st.nextElement();
			if (magazineMap.containsKey(token)) 
				magazineMap.put(token, magazineMap.get(token)+1);
			else
				magazineMap.put(token, 1);
		}	
		
    	st = new StringTokenizer(note);
		while (st.hasMoreElements()) {
			token = (String) st.nextElement();
			if (noteMap.containsKey(token)) 
				noteMap.put(token, noteMap.get(token)+1);
			else
				noteMap.put(token, 1);
		}
    }
    
    public boolean solve() {
        for (Entry<String, Integer> noteword : noteMap.entrySet())
        {
        	if (!magazineMap.containsKey(noteword.getKey()) || (noteword.getValue() > magazineMap.get(noteword.getKey()))) {
        	   return false;
        	}
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Eat whitespace to beginning of next line
        scanner.nextLine();
        
        RansomNote s = new RansomNote(scanner.nextLine(), scanner.nextLine());
        scanner.close();
        
        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    }
}
