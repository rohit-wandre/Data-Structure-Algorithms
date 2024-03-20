import java.util.*;
public class Main
{
    static int Prec(char ch)
    {
        switch(ch)
        {
            case '^':
                return 3;
            case '*': case '/':
                return 2;
                
            case '+' : case '-':
                return 1;
               
        }
        return -1;
    }
    static String infixToPrefix(String exp)
    {
        Stack<Character> stack = new Stack<>();
        String res = "";
        for(int i = exp.length()-1 ; i>=0; i--)
        {
            char ch = exp.charAt(i);
            
            if(ch == ')')
            {
                stack.push(ch);
            }
            else if(Character.isLetterOrDigit(ch))
            {
                res = res + ch;
            }
            else if(ch == '(')
            {
                while(!stack.isEmpty() && stack.peek()!= ')')
                {
                    res = res + stack.pop();
                }
            }
            else
            {
                while(!stack.isEmpty() && Prec(ch) <= Prec(stack.peek()))
                {
                    res = res + stack.pop();
                }
                stack.push(ch);
            }
            
        }
        return res;
    }
    
    
	public static void main(String[] args) {
		
		String exp = "a+b/c";
		String temp = infixToPrefix(exp);
		StringBuffer sb = new StringBuffer(temp);
		sb.reverse();
		System.out.println(sb);
	}
}
