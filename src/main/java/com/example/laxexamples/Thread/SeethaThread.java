
public class SeethaThread extends Thread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void run()
	{
		for (int i=0; i < 10; i++)
		{
			System.out.println("Seetha Thread");
			try {
				Thread.sleep(2000);
			}
			catch (InterruptedException ex)
			{
				
			}
		}
	}

}
