
// java.util.Stack

/* push()
   pop() returns the topmost element before deleting
   peek() returns top element 
   search() returns the position of the element from top of stack
*/

import java.util.*;
public class Main
{
    static void stack_push(Stack<Integer> stack)
    {
        for(int i=0;i<5;i++)
        {
            stack.push(i+1);
        }
        
    }
    
    static void stack_pop(Stack<Integer> stack)
    {
        for(int i=0;i<3;i++)
        {
            Integer x=(Integer)stack.pop();
            System.out.println(x);
        }
    }
    
    static void stack_peek(Stack<Integer> stack)
    {
        Integer x=(Integer)stack.peek();
        System.out.println("Topmost element is: "+x);
    }
    
    static void stack_search(Stack<Integer> stack,int key)
    {
        Integer pos=(Integer)stack.search(key);
        if(pos==-1)
        {
            System.out.println("Element not found");
        }
        else
        {
            System.out.println("Element found at position "+pos);
        }
    }
    
	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<>();
		stack_push(stack);
		stack_pop(stack);
		stack_push(stack);
		stack_peek(stack);
		stack_search(stack,1);
	}
}
