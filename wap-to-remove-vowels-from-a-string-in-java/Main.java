import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		String s=kb.next();
		s.toLowerCase();
// 		System.out.println(s);
// 		System.exit(0);
		StringBuffer sb=new StringBuffer(s);
		for(int i=0;i<sb.length();i++)
		{
		    if(sb.charAt(i)=='a'||sb.charAt(i)=='e'||sb.charAt(i)=='i'||sb.charAt(i)=='o'||sb.charAt(i)=='u')
		    {
		       
		        sb.deleteCharAt(i);
		        i--;
		      
		    }
		    
 		}
		System.out.println(sb);
	}
}
