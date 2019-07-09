import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

	public static boolean isBalanced(String expression) {

		if (expression.length() <=0) 
			return false;
		else 
		{
		  char[] brackets = expression.toCharArray();
		  Stack<Character> s = new Stack<>();
		  for (char bracket : brackets)
		    switch (bracket) 
		    {
		      case '{': s.push('}'); break;
		      case '(': s.push(')'); break;
		      case '[': s.push(']'); break;
		      default :
		        if (s.empty() || bracket != s.pop())
		          return false;
		    }
		  return s.empty();
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numOfCommands = in.nextInt();
		for (int count=0; count < numOfCommands; count++)
		{
	    	String s = in.next();
	       	System.out.println( (isBalanced(s)) ? "YES" : "NO" );
		}
	}
}


/*


#include <iostream>
#include <vector>
#include <cstring>
#include <stack>

using namespace std;

bool isOpen(char c)
{
    if(c == '(' || c == '{' || c == '[')
        return true;
    return false;
}

bool isBalanced(char popped, char now)
{
    if(popped == '(' && now ==')')
        return true;
    if(popped == '[' && now ==']')
        return true;
    if(popped == '{' && now =='}')
        return true;
    return false;
}

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        stack<char> s;
        string str;
        cin>>str;
        int no = 0;
        for(int i = 0; i < str.length(); i++)
        {
            char now = str[i];
            if(isOpen(now))
                s.push(now);
            else
            {
                char popped;
                if(s.size() > 0)
                {
                    popped = s.top();
                    s.pop();
                }
                else
                {
                    no = 1;
                    break;
                }
                if(isBalanced(popped, now))
                    continue;
                else
                {
                    no = 1;
                    break;
                }
            }
        }
        if(s.size() != 0)
            no = 1;
        if(no)
            cout<<"NO\n";
        else
        {
            cout<<"YES\n";
        }
    }
    return 0;
}
*/