import java.util.*;
public class Main
{
    
    static boolean validParenthesis(String s)
    {
        Stack<Character> stack = new Stack<>();
		for(int i = 0; i < s.length(); i++)
		{
		    if(s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[')
		    {
		        stack.push(s.charAt(i));
		    }
		    else
		    {
		      if(stack.isEmpty())
                {
                    return false;
                }
             
                if((stack.peek() == '(' && s.charAt(i) == ')') || (stack.peek() == '[' && s.charAt(i) == ']') || (stack.peek() == '{' && s.charAt(i) == '}'))
                {
                    stack.pop();
                }
                else
                {
                    return false;
                }
                        
		        }
    }
    return stack.isEmpty();
    }
    
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String s = kb.next();
		System.out.println(validParenthesis(s));
	}
}
