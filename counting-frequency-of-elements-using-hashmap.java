import java.util.*;
public class Main
{
	public static void main(String[] args) {
	HashMap<Integer,Integer> hmap=new HashMap<>();
	int arr[]={1,1,1,1,1,2,3,1,1};
	for(int i=0;i<arr.length;i++)
	{
	    if(hmap.containsKey(arr[i])) // if hashmap contains already contains the key, then get the value by get() and increment it by 1
	    {
	        hmap.put(arr[i],hmap.get(arr[i])+1);
	    }
	    else
	    {
	        hmap.put(arr[i],1); // else make the count of that element 1
	    }
	}
	for(Map.Entry et:hmap.entrySet())
	{
	    System.out.println(et.getKey()+"->"+et.getValue());
	}
	
	}
}

