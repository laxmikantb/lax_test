import java.util.*;

public class PowerSet {

	public static Set<Set<Character>> power(Set<Character> originalSet) {
	    Set<Set<Character>> sets = new HashSet<Set<Character>>();
	    if (originalSet.isEmpty()) {
	        sets.add(new HashSet<Character>());
	        return sets;
	    }
	    List<Character> list = new ArrayList<Character>(originalSet);
	    Character head = list.get(0);
	    Set<Character> rest = new HashSet<Character>(list.subList(1, list.size())); 
	    for (Set<Character> set : power(rest)) {
	        Set<Character> newSet = new HashSet<Character>();
	        newSet.add(head);
	        newSet.addAll(set);
	        sets.add(newSet);
	        sets.add(set);
	    }       
	    return sets;
	} 
	
	public static void main(String[] args)
	{
		HashSet<Character> originalSet = new HashSet<Character>();
		originalSet.add('a');
		originalSet.add('b');
		originalSet.add('c');
		power(originalSet);
	}
}
