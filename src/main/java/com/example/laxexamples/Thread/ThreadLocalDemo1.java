
public class ThreadLocalDemo1 {
	public static void main(String[] args) {
		ThreadLocal tl = new ThreadLocal() {
			public Object initialiValue()
			{
				return "abc";
			}
		};
		System.out.println(tl.get());
		tl.set("Durga");
		System.out.println(tl.get());
		tl.remove();
		System.out.println(tl.get());
	}
}
