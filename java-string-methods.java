
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	
 // boolean equals(Object), boolean equalsIgnoreCase(Object)	
	// int length(String)
	
 // char arr[]-->String            

 //  char arr[]={'a','b','c'};
// 	String s=new String(arr);
//  System.out.println(s);
	
 //  char arr[]->String (no. of characters you want to covert in string)	

// 	String s1=new String(arr,0,3);
// 	System.out.println(s1);
	
	
 //	public int compareTo(String) returns 0 if strings are same else returns difference in ASCII value
	
// 	String s1=new String("bhopal");
// 	String s2=new String("bhopap");
// 	System.out.println(s1.compareTo(s2));
	
	
 // public int compareToIgnoreCase(String)


 // public int indexOf(char) returns -1 if not found. returns first occurence of that character 

// String s=new String("rohit");

// System.out.println(s.indexOf('h'));
	
 //public int indexOf(String)

//  String s=new String("rohit");

//  System.out.println(s.indexOf("oh"));
	
	
 // public int lastIndexOf(char)
    //  String s=new String("welcome");
    //  System.out.println(s.lastIndexOf('e'));
     
 // public int lastIndexOf(String)
  
    //  String s=new String("welcome");
    //  System.out.println(s.lastIndexOf("co"));
 
 //public char charAt(int) takes index as argument and returns character at that index

    // String s=new String("rohit");
    // System.out.println(s.charAt(3));
    
    
 // public boolean startsWith(String) returns true if string begins with specified string 
 
    //   String s=new String("rohit");
    //   System.out.println(s.startsWith("ho"));
      
 // public boolean endsWith(String) returns true if string ends with specified string 
 
    //   System.out.println(s.endsWith("it"));
    
 // public String subString(int,int)
  
//   String s=new String("hello");
   
//   System.out.println(s.substring(0,3));
	
// 	System.out.println(s.substring(2));
	
// public String toUpperCase(),toLowerCase()


 // public static String valueOf(primitive datatype) // Converts primitive into string
 
//  int a=10;
//  String s=String.valueOf(a);
//  System.out.println(s);
 
           // STRING BUFFER OBJECTS ARE MUTABLE I.E. THE OBJECT CAN BE CHANGED
 
 String s="rohit";
 
StringBuffer sb=new StringBuffer();
//sb.append(s);
//sb.append(" wandre");
// sb.reverse();

//sb.replace(2,5,"tla"); // starting index, ending index+1, string to be replaced
//System.out.println(s);

sb.insert(5,"wandre"); // insert(String), insert(char)
System.out.println(s);

sb.delete(0,5);
System.out.println(s);

sb.deleteCharAt(5);
System.out.println(s);


	}
}
