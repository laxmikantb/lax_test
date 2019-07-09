import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;



public class Demo {

	public static void main(String[] args) {
//		HashMap m = new HashMap();
//		m.put("chiranjivi", 700);
//		m.put("bhalian", 800);
//		m.put("venky", 200);
//		m.put("naga", 500);
//		
//		System.out.println(m);
//		System.out.println(m.put("chiranjivi", 1000));
//		Set s = m.keySet();
//		System.out.println("KEYSET " + s);
//		Collection c = m.values();
//		System.out.println("Collection " + c);
//		Set s1 = m.entrySet();
//		System.out.println("Entry Set " + s1);
//		Iterator itr =  (Iterator) s1.iterator();
//		while(itr.hasNext()) {
//			Map.Entry m1 = (Map.Entry)itr.next();
//			System.out.println("MapEntry Key " + m1.getKey());
//			if (m1.getKey().equals("naga")) {
//			    m1.setValue(10000);	
//			}
//		}
//		System.out.println("Updated Map " + m);
//		
//		new Demo().linkHashDemp();
		
		ConcurrentHashMap<Integer, String> h = new ConcurrentHashMap<Integer, String>();
		h.put(1,"1");
		h.put(1,"1");
		h.put(1,"1");
		h.put(1,"1");
		h.put(1,"1");
		h.put(1,"1");
		h.put(1,"1");
		h.put(1,"1");
		
		System.out.println(h);

	}
	
	public void linkHashDemp()
	{
		LinkedHashMap m = new LinkedHashMap();
		m.put("naga", 500);
		m.put("chiranjivi", 700);
		m.put("bhalian", 800);
		m.put("venky", 200);

		
		System.out.println(m);
		System.out.println(m.put("chiranjivi", 1000));
		Set s = m.keySet();
		System.out.println("KEYSET " + s);
		Collection c = m.values();
		System.out.println("Collection " + c);
		Set s1 = m.entrySet();
		System.out.println("Entry Set " + s1);
		Iterator itr =  (Iterator) s1.iterator();
		while(itr.hasNext()) {
			Map.Entry m1 = (Map.Entry)itr.next();
			System.out.println("MapEntry Key " + m1.getKey());
			if (m1.getKey().equals("naga")) {
			    m1.setValue(10000);	
			}
		}
		System.out.println("Updated Map " + m);
	}

}
