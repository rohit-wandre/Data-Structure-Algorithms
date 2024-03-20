import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   String str = "rohit wandre";
	   String [] words = str.split(" "); // split() splits the string into multiple strings based on the delimiter passed
	   
	  String res ="";
	   for(int i = 0; i < words.length; i++)
	   {
	       String temp = words[i];
	       String rev = "";
	       for(int j = temp.length() -1; j>=0; j--)
	       {
	           rev = rev + temp.charAt(j);
	       }
	       res = res + rev + " ";
	   }
	   
	   /*
	   StringBuffer sb = new StringBuffer();
	   StringBuffer temp = new StringBuffer();
	   
	   for(int i = 0; i < words.length; i++)
	   {
	       temp.append(words[i]);
	       temp.reverse();
	       sb.append(temp);
	       sb.append(" ");
	       temp = new StringBuffer("");
	   }
	   */
	   
	System.out.println(res);

	//System.out.println(sb);
	}
	
}
