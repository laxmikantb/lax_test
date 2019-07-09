package org.lax.java8;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.stream.Stream;

public class OptionalBasicExample {
    public static void main(String[] args) throws ParseException {
    	
/*    	Function<String , Integer> f11 = (s) -> s.length();
    	Function<Integer, Boolean> f12 = (i) -> i < 10;
    	Function<String , Boolean> f13 = f11.andThen(f12);
    	
    	
    	System.out.println(f13.apply("JAVA 8"));*/
    	ArrayList<String> f2 = new ArrayList<String>();
    	f2.add("Mango");
    	f2.add("Orange");
    	f2.add("Bannna");
    	Stream<String> fs = f2.parallelStream();
    	fs.filter(fruit -> { 
    		System.out.println("Fruit" + fruit);
      	   return false;
    	});
    	
    	/*
    	Stream.of("Mango","Orange","Apple").filter(f -> { System.out.println("Fruit" + f);
    	return true;
    	});
    	*/
    	/*
    	List<Integer> c1 = Arrays.asList(1,2,3,4,5 );
    	List<Integer> result = c1.stream().skip(2).collect(Collectors.toCollection(ArrayList::new));
    	System.out.println(result.toString());

    	*/
    	/*
    	List<String> c1 = Arrays.asList("1","2","3","4" );    
    	String result = c1.stream().reduce("",String::concat);
    	System.out.println(result);
    	ZonedDateTime dateTime = ZonedDateTime.now();
    	System.out.println(dateTime);
    	
    	LocalDateTime dateTime1 = LocalDateTime.now();
    	System.out.println(dateTime.toLocalTime());
    	
    	OffsetDateTime d3 = OffsetDateTime.now();
    	System.out.println(d3);
    	
    	System.out.println(Calendar.getInstance().getTime());
    	*/
    	/*
        Optional<String> nonEmptyGender = Optional.of("male");
        Optional<String> emptyGender = Optional.empty();

        System.out.println("Non-Empty Optional:: " + nonEmptyGender.map(String::toUpperCase));
        System.out.println("Empty Optional    :: " + emptyGender.map(String::toUpperCase));

        Optional<Optional<String>> nonEmptyOtionalGender = Optional.of(Optional.of("male"));
        System.out.println("Optional value   :: " + nonEmptyOtionalGender);
        System.out.println("Optional.map     :: " + nonEmptyOtionalGender.map(gender -> gender.map(String::toUpperCase)));
        System.out.println("Optional.flatMap :: " + nonEmptyOtionalGender.flatMap(gender -> gender.map(String::toUpperCase)));

        //Filter on Optional
        System.out.println(nonEmptyGender.filter(g -> g.equals("male"))); //Optional.empty
        System.out.println(nonEmptyGender.filter(g -> g.equalsIgnoreCase("MALE"))); //Optional[MALE]
        System.out.println(emptyGender.filter(g -> g.equalsIgnoreCase("MALE"))); //Optional.empty
        
        if (nonEmptyGender.isPresent()) {
            System.out.println("Value available.");
        } else {
            System.out.println("Value not available.");
        }
        
        emptyGender.ifPresent(g -> System.out.println("In emptyGender Option, value available."));
        
        System.out.println(nonEmptyGender.orElse("<N/A>")); //MALE
        System.out.println(emptyGender.orElse("<N/A>")); //<N/A>

        System.out.println(nonEmptyGender.orElseGet(() -> "<N/A>")); //MALE
        System.out.println(emptyGender.orElseGet(() -> "<N/A>")); //<N/A>
        
*/
    }
}
