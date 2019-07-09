
public class IntegerToRomanDemo {

	public static String getRoman(int num) {
	    int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
	    String[] strs = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
	    
	    StringBuilder sb = new StringBuilder();
	    
	    for(int i=0;i<values.length;i++) {
	        while(num >= values[i]) {
	            num -= values[i];
	            sb.append(strs[i]);
	        }
	    }
	    return sb.toString();
	}

	public String intToRoman(int num) {
	    String M[] = {"", "M", "MM", "MMM"};
	    String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
	    String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
	    String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
	    return M[num/1000] + C[(num%1000)/100]+ X[(num%100)/10] + I[num%10];
	}

	 public int romanToInt(String s) {
		    int nums[]=new int[s.length()];
		    for(int i=0;i<s.length();i++){
		        switch (s.charAt(i)){
		            case 'M':
		                nums[i]=1000;
		                break;
		            case 'D':
		                nums[i]=500;
		                break;
		            case 'C':
		                nums[i]=100;
		                break;
		            case 'L':
		                nums[i]=50;
		                break;
		            case 'X' :
		                nums[i]=10;
		                break;
		            case 'V':
		                nums[i]=5;
		                break;
		            case 'I':
		                nums[i]=1;
		                break;
		        }
		    }
		    int sum=0;
		    for(int i=0;i<nums.length-1;i++){
		        if(nums[i]<nums[i+1])
		            sum-=nums[i];
		        else
		            sum+=nums[i];
		    }
		    return sum+nums[nums.length-1];
		}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
