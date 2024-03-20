import java.util.*;
public class Main
{
    
    static int Prec(char c) // to check precedence of operator. Greater value returned, higher the priority
    { 
        switch(c)
        {
            case '+': case '-':
                return 1;
            case '*': case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    
    
    static String infixToPostfix(String exp)
    {
        String result = new String("");
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<exp.length(); i++)
        {
            char c = exp.charAt(i);
            if(Character.isLetterOrDigit(c)) //  if incoming symbol is an operand then add it to the result
            {
                result+= c;
            }
            
            else if(c =='(') // if incoming symbol is an opening parenthesis, push it into stack.
            {
                stack.push(c);
            }
            
            else if(c == ')') // if incoming symbol is closing parenthesis, pop the elements until '('' is encountered
            {
                while(!stack.isEmpty()&&stack.peek()!='(')
                {
                    result+= stack.pop();
                }
            }
            
            else // if operator is encountered
            {
                while(!stack.isEmpty() && Prec(c)<=Prec(stack.peek())) // if incoming operator precedence is less than or equal to the top of stack
                {
                    result+= stack.pop();
                }
                stack.push(c); // if incoming operator's precedence is greater than > TOS
            }
        }
        return result;
    }
    
	public static void main(String[] args) {
	String exp = "a+b*(c^d-e)^(f+g*h)-i";
	System.out.println(infixToPostfix(exp));
	}
}
