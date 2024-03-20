import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		HashMap<String,Integer> hmap=new HashMap<>();
		
		//----------------------------------------------for inserting data in the map as (K,V)-------------------------------
		hmap.put("Rohit",1);
		hmap.put("Ravi",2);
		hmap.put("kishan",3);
		
		//-------------------------------------------------Retrieving all values together------------------------------------
		System.out.println(hmap);
		
		//---------------------------------------------------Retrieving all keys--------------------------------------------- 
		  // for this we have to do 2 things:
		   // 1.call keySet() of Set which returns set of keys of HashMap
		   // 2. Iterate over this set using iterator
		   
// 		/*1*/ Set s=hmap.keySet();
// 		/*2*/ Iterator it=s.iterator();
		 
// 		 while(it.hasNext())
// 		 {
// 		     String str=(String)it.next();
// 		     System.out.println(str);
// 		 }
		   
		 //--------------------------------------------------Retreiving values-----------------------------------------------
		  //1. call values() which will return Collection of values of HashMap
		  //2.Use iterator over this Collection
		  
		  //Collection c=hmap.values();
		  //Iterator it2=c.iterator();
		  //while(it2.hasNext())
		  //{
		  //     int res=(int)it2.next();
		  //    System.out.println(res);
		  //}
		   
		   
		 //-------------------------------------------Retreiving key value pairs(k,v)----------------------------------------
		  
		   //1. call entrySet() which will return set of all key,value pairs
		   //2. iterate over this set 
		   
		  // Set s=hmap.entrySet();
		   
		  // Iterator it3=s.iterator();
		   
		  // while(it3.hasNext())
		  // {
		  //     Map.Entry et=(Map.Entry)it3.next(); 
		  //     System.out.println(et.getKey()+","+et.getValue());
		  // }
		 
		   
		  // containsValue()---> to check whether value exist in the map or not..
		     //System.out.println(hmap.containsValue(2));
		   
		 // size():--> System.out.println(hmap.size());
		 
		// hmap.remove("Rohit");
		 
		 
		   
	}
}

