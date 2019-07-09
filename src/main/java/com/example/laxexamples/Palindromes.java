
public class Palindromes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String x = "POP";
        if(isPal(x))
            System.out.println(x + " is a palindrome");
        else
            System.out.println(x + " is not a palindrome");
        
        printAllPalindromes("abcddcbaABCDEDCBA");
	}
	
    public static boolean isPal(String s)
    {
        if(s.length() == 0 || s.length() == 1)
            return true;//if length =0 OR 1 then it is 
        if(s.charAt(0) == s.charAt(s.length()-1))//check for first and last char of String, if they are same then do the same thing for a substring with first and last char removed. and carry on this until you string completes or condition fails
            return isPal(s.substring(1, s.length()-1));//if its not the case than string is not.
        return false;
    }

    public static void printAllPalindromes(String inputText)
    {
    	  if(inputText.isEmpty()){
    		   System.out.println("Input cannot be null!");
    		   return;
    	  }
    		  if(inputText.length()<=2){
    		   System.out.println("Minimum three characters should be present");
    		  }
    		  //ODD Occuring Palindromes
       int len = inputText.length();
    		  
    	for(int i=1;i<len-1;i++)
    	{
    		for(int j=i-1,k=i+1; j>=0 && k<len;j--,k++)
    		{
    		    if(inputText.charAt(j) == inputText.charAt(k))
    		    {
    		      System.out.println(inputText.subSequence(j,k+1));
    		    }
    		    else
    		    {
    		     break;
    		    }
    		}
    	}
    		  
    	//EVEN Occuring Palindromes
    	 for(int i=1;i<len-1;i++)
    	 {
    		   for(int j=i,k=i+1;j>=0 &&k<len; j--,k++){
    		   if(inputText.charAt(j) == inputText.charAt(k)){
    		     System.out.println("EVN " + inputText.subSequence(j,k+1));
    		    }
    		   else{
    		     break;
    		    }
    		   }
    		  }
    		 
    		 }

}
