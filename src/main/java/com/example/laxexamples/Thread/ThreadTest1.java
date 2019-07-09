
/**
 * @author laxmikant
 *
 */
public class ThreadTest1 extends Thread {

	public static void main(String[] args) {
		ThreadTest1 t = new ThreadTest1();
		t.start();

	}
	
	public void run() {
		for (int i=0; i < 10; i++) {
			System.out.println(i);;
		}
	}

}

