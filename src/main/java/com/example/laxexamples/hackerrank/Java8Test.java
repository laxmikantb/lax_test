import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Test implements LeftInterface, RightInterface{
	 int x =10;
   public static void main(String args[]){
	      Java8Test tester = new Java8Test();
		
	      //old wauy for starting thread
	      new Thread(new Runnable() {
				public void run() {
					System.out.println("Thread ran the old way");
				}
			}).start();
			
		  // Lambada way
		  new Thread(() -> System.out.println("Thread ran the new way")).start();
			
	      //with type declaration
	      MathOperation addition = (int a, int b) -> a + b;
			
	      //with out type declaration
	      MathOperation subtraction = (a, b) -> a - b;
			
	      //with return statement along with curly braces
	      MathOperation multiplication = (int a, int b) -> { return a * b; };
			
	      //without return statement and without curly braces
	      MathOperation division = (int a, int b) -> a / b;
			
	      System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
	      System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
	      System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
	      System.out.println("10 / 5 = " + tester.operate(10, 5, division));
			
	      //without parenthesis
	      GreetingService greetService1 = message ->
	      System.out.println("Hello " + message);
			
	      //with parenthesis
	      GreetingService greetService2 = (message) ->
	      System.out.println("Hello " + message);
			
	      greetService1.sayMessage("Mahesh");
	      greetService2.sayMessage("Suresh");
	      tester.testm1();
	      tester.i1(); // use of default methid how to ?
	      
	      Consumer<String> c = (z) -> System.out.println(z.toLowerCase());
	      c.accept("Java2s.com");
	      int z = 99;
	      Consumer<Integer> myConsumer = (y) -> 
	      {
	          System.out.println("consumer x = " + z); // Statement A
	          System.out.println("consumer y = " + y);
	      };

	      myConsumer.accept(z);
	    
	      List<Student> students = Arrays.asList(
	              new Student("John", 3),
	              new Student("Mark", 4.1),
	              new Student("Mark2", 4.0),
	              new Student("Mark3", 3.4),
	              new Student("JFK", 3.54),
	              new Student("Harry", 3.74),
	              new Student("Pindu", 3.54),
	              new Student("Kandu", 3.62),
	              new Student("Manoj", 3.41),
	              new Student("Sunil", 3.94)
	        );

	        acceptAllEmployee(students, e -> System.out.println(e.name));
	        acceptAllEmployee(students, e -> {
	           e.gpa *= 1.5;
	        });
	        acceptAllEmployee(students, e -> System.out.println(e.name + ": " + e.gpa));
	        students.sort((Student o1, Student o2)-> o1.name.compareTo(o2.name));
	        students.forEach((student)->System.out.println(student.name));
	        
	        List<NewStudent> list = students.stream().map(temp -> {
	        	NewStudent obj = new NewStudent();
	        	obj.gpa = temp.gpa;
	        	obj.name = temp.name;
	        	obj.extra = "This is new Field ";
	        	return obj;
	        }).collect(Collectors.toList());
	        list.forEach((newstudent)->System.out.println(newstudent.name +  " " + newstudent.extra));
	        Function<Integer,String> converter = (i)-> Integer.toString(i);// Function
	        
	        
	        System.out.println("Function Called " + converter.apply(3).length());
	        System.out.println("Function Called " +  converter.apply(30).length());
	      
   
	      Supplier<String> s= ()-> { String[] s1 = { "aa" , "bb ", "cc" , "dd"};
	      							 int x = (int) (Math.random()*3 + 1);
	      							 return s1[x];
	      							};

	      System.out.println(s.get());
	      System.out.println(s.get());
	      System.out.println(s.get());
	      System.out.println(s.get());
	      
	      ArrayList<Integer> l = new ArrayList();
	      l.add(0);
	      l.add(10);
	      l.add(20);
	      l.add(5);
	      l.add(15);
	      l.add(20);
	      l.add(30);
	      
	      System.out.println(l);
	      List<Integer> l2 = l.stream().filter(i->i%2==0).collect(Collectors.toList());
	      System.out.println(l2);
	      
	      l2 = l.stream().map(i->i*2).collect(Collectors.toList());  // operation
	      System.out.println(l2);
	      
	      List<Player> players = new ArrayList<Player>();
	      players.add(new Player("Lab","Bop",87));
	      players.add(new Player("Lili","John",71));
	      players.add(new Player("Henry","K",58));
	      players.add(new Player("Ajay","M",11));
	      players.add(new Player("Marlin","J",7));
	      players.add(new Player("J","J",75));
	      
	      System.out.println("Non Lambda");
	      for (Player p : players) {
	    	  System.out.println("#" + p.number);
	      }
	      System.out.println(" Lambda");
	      players.stream().map(x -> x.number).forEach(x -> System.out.println("#" + x));
	      
	      Arrays.stream(new int[] {1, 2, 4})
	      .map(n -> 2 * n + 1)
	      .average()
	      .ifPresent(System.out::println);  // 5.0
	      
	      Stream.of("d2", "a2", "b1", "b3", "c")
	      .map(s2 -> {
	          System.out.println("map: " + s2);
	          return s2.toUpperCase();
	      })
	      .anyMatch(s2 -> {
	          System.out.println("anyMatch: " + s2);
	          return s2.startsWith("A");
	      });
	      
	      List<Person> persons =
	    		    Arrays.asList(
	    		        new Person("Max", 18),
	    		        new Person("Peter", 23),
	    		        new Person("Pamela", 23),
	    		        new Person("Lab", 23),
	    		        new Person("David", 12));
	      
	      String phrase = persons
	    		    .stream()
	    		    .filter(p -> p.age >= 18)
	    		    .map(p -> p.name)
	    		    .collect(Collectors.joining(" AND ", "In Germany ", " are of legal age."));

	    		System.out.println(phrase);
	    		
	    		Map<Integer, String> map = (Map) persons
	    			    .stream()
	    			    .collect(Collectors.toMap(
	    			        p -> p.age,
	    			        p -> p.name,
	    			        (name1, name2) -> name1 + ";" + name2));

	    			System.out.println(map);
	   }
   
   		public static void acceptAllEmployee(List<Student> student, Consumer<Student> printer) {
	      for (Student e : student) {
	         printer.accept(e);
	      }
	   }
   
	   public void i1() {
		   System.out.println("My Own Interface");
		   LeftInterface.super.i1();
	   }
   // mathod local and class variable are also accesible to lamda function , method local variable only treated as final only
       public void testm1() {
    	   int y = 0;
 	      java8interface i = () -> {
 	    	  // y++; //compile time error local variable should be final
	    	  System.out.println("X " + x);
	    	  System.out.println("Y " + y);
	      };
	      i.m2();
       }
		
	   interface MathOperation {
	      int operation(int a, int b);
	   }
		
	   interface GreetingService {
	      void sayMessage(String message);
	   }
		
	   private int operate(int a, int b, MathOperation mathOperation){
	      return mathOperation.operation(a, b);
	   }
}
