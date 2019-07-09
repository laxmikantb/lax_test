
public class MyChildThread extends Thread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void run()
	{
		try {
			for (int i=0; i < 10; i++)
			{
				System.out.println(" I am lasy thread");
				Thread.sleep(4000);
			}
		}
		catch (InterruptedException e)
		{
			System.out.println(" lazy thread - i got interrupted");
		}
	}

}
