package org.lax.java8;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerTest {
	public static void main(String[] args) {
		Consumer<String> c1 = s-> System.out.println(s);
		c1.accept("Hello");
		c1.accept("Durgasoft");
		
		ArrayList<Movie> l = new ArrayList<Movie>();
			ConsumerTest test = new ConsumerTest();
			test.populate(l);
			Consumer<Movie> c = m-> {
				System.out.println(m.name);
				System.out.println(m.hero);
				System.out.println(m.heroine);
			};
			
			for (Movie m : l) {
				c.accept(m);
			}
			
			Consumer<Movie> cone = m -> System.out.println("Movie " + m.name + " is ready for Release ");
			Consumer<Movie> ctwo = m -> System.out.println("Movie " + m.name + " is " + m.result);
			Consumer<Movie> cthree= m -> System.out.println("Movie " + m.name + " is ready for store in db ");

			Consumer<Movie> chainedC = cone.andThen(ctwo).andThen(cthree);
			chainedC.accept(l.get(0));
			chainedC.accept(l.get(3));
			
	}
	
		public void populate(ArrayList<Movie> l)
		{
			l.add(new Movie("Bahubai","Prabha","Anushka","Hit"));
			l.add(new Movie("Dangal","Amir","Ritu","Hit"));
			
			l.add(new Movie("Sultan","Salman","Anushka","Hit"));
			l.add(new Movie("Rayees","Shahrukh","Sunny","Flop"));
		}
	
}
