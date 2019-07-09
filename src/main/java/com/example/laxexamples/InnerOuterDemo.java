

public class InnerOuterDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Inner1 i1 = new Inner1();
		i1.setPubInt();

		Inner1.Inner2 i2 = i1.new Inner2();
		i2.accessInner1();
		
		Inner1.StaticInner si = new Inner1.StaticInner();
		si.Method2();

	}

}
