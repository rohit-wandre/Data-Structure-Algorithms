
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	
	ArrayList<String> cities=new ArrayList<>();

  // add()
	cities.add("indore");
	cities.add("bhopal");
	cities.add("jabalpur");
	
	Collections.sort(cities);
	
	for(String result:cities)
	{
	    System.out.println(result);
	}
	
  //get()
  
// 	String s=cities.get(1);
// 	System.out.println(s);
	
  //remove()
  
// 	cities.remove(1);
// 	System.out.println(cities.remove("bhopal"));
// 	for(String name:cities)
// 	{
// 	    System.out.println(name);
// 	}
	
// 	//size()

// 	System.out.println(cities.size());
	
// 	//contains()
   
//     System.out.println(cities.contains("indore"));	
    
   
    
    
    
    
	}
}
