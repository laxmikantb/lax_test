
public class ParentThread extends Thread {
	public static InheritableThreadLocal tl = new InheritableThreadLocal() {
		public Object childValue() {
			return "cc";
		}
	};
	
	public void run() {
		tl.set("pp");
		System.out.println("Parent Thread value " + tl.get()); // should get pp
		ChildThread ct = new ChildThread();
		ct.start();
	}

}
