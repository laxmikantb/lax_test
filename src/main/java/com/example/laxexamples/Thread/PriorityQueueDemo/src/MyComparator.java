import java.util.Comparator;

public class MyComparator implements Comparator {

@Override
public int compare(Object arg0, Object arg1) {
	// TODO Auto-generated method stub
	Integer s1 = (Integer) arg0;
	Integer s2 = (Integer) arg1;
	return s2.compareTo(s1);

}
}
