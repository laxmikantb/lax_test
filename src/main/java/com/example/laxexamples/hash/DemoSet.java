import java.util.HashSet;

public class Demo {

	public static void main(String[] args) {
		HashSet s = new HashSet();
		s.add("A");
		s.add(2);
		s.add("B");
		s.add(2); // will not insert as duplicate
		s.add("C");
		s.add("D");
		
	System.out.println(s.add("D"));
	System.out.println(s);
		

	}

}
