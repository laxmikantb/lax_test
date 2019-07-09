import java.io.FileInputStream;
import java.io.FileOutputStream;


public class FinallyTest {

	public static void main(String[] args)  {
		System.out.println(new FinallyTest().test1());

	}
	
	public int test1() {
		try {
			FileOutputStream is = new FileOutputStream("x.y");
			is.close();
			return 1;
		} catch (Exception ex){
			System.out.println("Exception " + ex.getMessage());
		} finally {
			return 2;
			
		}
	}

}
