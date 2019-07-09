import java.util.ArrayList;
import java.util.Iterator;


public class IterartorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		for (int i =0; i <=10; i++)
			al.add(i);
		
		Iterator ie = al.iterator();
		while (ie.hasNext()) 
		{
			Integer i = (Integer) ie.next();
			if (i % 2 == 0)
				System.out.println(i);
			else
				ie.remove();
		}
		
		System.out.println(al);

	}

}
