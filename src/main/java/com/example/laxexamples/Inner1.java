
public class Inner1 {
	static int staticVar = 20;
	private int inner1_priInt = 1;
	public  int inner1_pubInt = 2;
	protected int inner1_protInt = 3;
	final int inner1_finalInt = 20;
	Inner2 inner2 = new Inner2();
	int x = 10;
	
	StaticInner si = new StaticInner();
	
	
	
	public void setPubInt()
	{
		inner1_protInt = 3*10;
		inner1_priInt = 100*5;
	}
	
	class Inner2 {
		
		// cannot have static declaration or static methods
/*		public static void main(String[] args) {
			
		}*/


		private int inner2_priInt;
		public  int inner2_pubInt;
		protected int inner2_protInt;
		final int inner2_finalInt = 20;
		int x=20;
		
		public void accessInner1()
		{
			System.out.println("inner1_finalInt : " + inner1_priInt);
			System.out.println("inner1_finalInt : " + inner1_pubInt);
			System.out.println("inner1_finalInt : " + inner1_protInt);
			System.out.println("inner1_finalInt : " + inner1_finalInt);
			si.Method1();
			si.Method2();
			int x =1000;
			System.out.println("Local x "+ x);
			System.out.println("Instance Inner2 x "+ this.x);
			System.out.println("Instance Outer x "+ Inner1.this.x);
		}
		
	}
	
	public static class StaticInner {
		static int si = 10;
		public void Method1()
		{
			System.out.println("Method1 from StaticInner : ");
		}
		
		public static void Method2()
		{
			System.out.println("Method2 Static from StaticInner : " + staticVar);
		}
	
	}
	
	public static void main(String[] args) {
		
	}

}
