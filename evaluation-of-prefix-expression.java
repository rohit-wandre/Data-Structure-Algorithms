import java.util.*;
public class Main
{
   static boolean isOperand(char ch)
   {
       if(ch >= 48 && ch <= 57)
       {
           return true;
       }
       return false;
   }
    
    static int evalPre(String exp)
    {
        Stack<Integer> stack = new Stack<>();
        for(int i = exp.length()-1; i>=0; i--)
        {
            char ch = exp.charAt(i);
            
            if(isOperand(ch)) // if incoming symbol is an operand
            {
                stack.push(ch-'0');
            }
            else
            {
                int op1 = stack.peek();
                stack.pop();
                int op2 = stack.peek();
                stack.pop();
              switch(ch)
             {
                case '+':
                stack.push(op1+op2);
                break;
                case '-':
                stack.push(op1-op2);
                break;
                case '*':
                stack.push(op1*op2);
                break;
                case '/':
                stack.push(op1/op2);
                break;
                case '^':
                stack.push(op1^op2);
                break;
              }
            }
        }
        return stack.peek();
    }
    
    
	public static void main(String[] args) {
		String exp = "-+2*34/16^23";
		System.out.println(evalPre(exp));
	}
}
