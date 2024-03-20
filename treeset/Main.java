import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
	TreeSet<String> ts=new TreeSet<>();
	ts.add("A");
	ts.add("G");
	ts.add("B");
	ts.add("K");
	ts.add("C");
	
	Iterator it=ts.iterator();
	while(it.hasNext())
	{
	    String s=(String)it.next();
	    System.out.println(s);
	}
		
		
	}
}
