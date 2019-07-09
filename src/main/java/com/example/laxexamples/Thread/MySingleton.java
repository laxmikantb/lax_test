
public class MySingleton {
	private static MySingleton instance = null;
	public void showMessage() { System.out.println("Message from SIngleton"); }
	
	private MySingleton() {
		
	}
	
	public static MySingleton getInstance() {
		if (instance == null)
		{
			synchronized(MySingleton.class) {
				if (instance== null) {
					instance= new MySingleton();
				}
			}
		}
		return instance;
	}
	
	public static void main(String[] args) {
		MySingleton.getInstance().showMessage();
	}

}
