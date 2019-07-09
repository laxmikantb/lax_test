
public class NoInterruptedThread extends Thread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void run()
	{
		try {
		for (int i=0; i < 1000; i++)
		{
			System.out.println("NoInterruptedThread Thread");
		}
		}
		catch (Exception ex)
		{
			System.out.println("NoInterruptedThread Thread Exception ");
		}
	}

}
