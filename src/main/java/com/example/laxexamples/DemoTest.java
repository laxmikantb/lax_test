
public class DemoTest {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inner1 in1 = new Inner1();
		Inner1.Inner2 in2 = in1.new Inner2();
		System.out.println("in2.inner2_finalInt : " + in2.inner2_finalInt);
		System.out.println("in2.inner2_finalInt : " + in2.inner2_finalInt);
		System.out.println("in2.inner2_finalInt : " + in2.inner2_finalInt);
		System.out.println("in2.inner2_finalInt : " + in2.inner2_finalInt);
		
		in2.accessInner1();
		
		Inner1.StaticInner st = new Inner1.StaticInner();
		st.Method1();
		st.Method2();
	
	}

}
