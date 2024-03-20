import java.util.*;
public class Main
{
	public static void main(String[] args){
	Scanner kb=new Scanner(System.in);
	System.out.println("Enter 2 nos");
	int a=kb.nextInt();
	int b=kb.nextInt();
	int c;
	try{
	    if(a<=0)
	    {
	        ArithmeticException e=new ArithmeticException("Numerator must be positive");
	        throw e;
	    }
	   c=a/b;
	   System.out.println(c);
	 
	}
	  
	catch(InputMismatchException e)
	{
	  System.out.println("Please Enter integers only");
	  System.exit(0);
	}
	catch(ArithmeticException ex)
	{
	    System.out.println(ex);
	}
		finally{
	    System.out.println("hello");
	}
	System.out.println(a+b);
	
	
	
	}

}
