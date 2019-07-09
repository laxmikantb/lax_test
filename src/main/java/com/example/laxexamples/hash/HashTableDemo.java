import java.util.Hashtable;

public class Demo { /** uses == operator instead of equals */

	public static void main(String[] args) throws Exception {
		Hashtable m = new Hashtable();
		m.put(10,  "durga");
		m.put(11,  "durga");
		m.put("11",  "durga"); // Class cast Exception
	    //m.put(null,  200); // Null Pointer Exception
		System.out.println(m);

		System.out.println("Updated Hashtable " + m);
		

	}

	}