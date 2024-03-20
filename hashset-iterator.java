import java.util.*;
public class Main
{
	public static void main(String[] args) {
	
	HashSet<String> hs=new HashSet<>();
	hs.add("lucknow");
	hs.add("lucknow"); //duplicates are not allowed..
	hs.add("bhopal");
	
	Iterator it=hs.iterator();
	
	while(it.hasNext())
	{
	    String s=(String)it.next(); //explicitly type casted into string object
	    System.out.println(s);
	}
	
	
	}
}
