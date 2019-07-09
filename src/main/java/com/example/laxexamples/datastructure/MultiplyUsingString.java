package com.example.laxexamples.datastructure;

public class MultiplyUsingString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiplyUsingString p = new MultiplyUsingString();
		//p.multiply("123", "45");
		p.multiply2("123","45");
	}
	
    public String multiply(String num1, String num2) {
        char[] result = new char[num1.length() + num2.length()];
        for(int i = 0; i < result.length; ++i)
            result[i] = '0';
        for(int i = num1.length() - 1; i >= 0; --i) {
            int index = num1.length() + num2.length() - 1 - (num1.length() - 1 - i);
            int digit1 = Character.getNumericValue(num1.charAt(i));
            for(int j = num2.length() - 1; j >= 0; --j) {
                int digit2 = Character.getNumericValue(num2.charAt(j));
                int temp = digit1 * digit2;
                int previous = Character.getNumericValue(result[index]);
                result[index] = (char) ((previous + temp) % 10 + '0');
                int carry = (previous + temp) / 10;
                int m = index - 1;                
                while(carry != 0 && m >= 0) {
                    int rm = Character.getNumericValue(result[m]);
                    result[m] = (char)((rm + carry) % 10 + '0');
                    carry = (rm + carry) / 10;
                    m--;
                }
                 
                index--;
            }
        }
        return new String(result).replaceFirst("^0+(?!$)", "");
    }
    
    public String multiply2(String str1, String str2)
    {
    	char[] str1Char = str1.toCharArray();
    	char[] str2Char = str2.toCharArray();
    	
    	char[] result = new char[str1.length()  + str2.length()];
    	for (int i =0; i < result.length; i++)
    		result[i] = '0';
    	int index = result.length-1;
    	int digit1, digit2;
    	int carry;
    	for (int i = str1Char.length-1; i >=0; i--)
    	{
    		index = result.length-1;
    		digit1 = Character.getNumericValue(str1Char[i]);
    		for (int j= str2Char.length-1; j >=0; j--)
    		{
    			digit2 = Character.getNumericValue(str2Char[j]);
    			int temp = digit1 * digit2;
    			int currentResult = Character.getNumericValue(result[index]);
    			result[index] = (char)((currentResult  + temp) % 10 + '0');
    			carry = (currentResult  + temp) /10;
    			int m = index - 1;
    			while (carry !=0 && m >= 0)
    			{
    				int rm = Character.getNumericValue(result[m]);
    				result[m] = (char)((rm + carry) % 10 + '0');
    				carry = (rm + carry) / 10;
    				m--;
    			}
    			index--;
    			
    		}
    		
    		
    	}
    	
    	
    	return null;
    }

}
