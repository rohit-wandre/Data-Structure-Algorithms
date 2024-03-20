import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String s="aabcd";
		int temp[]=new int[26];
		int n=s.length();
		for(int i=0;i<n;i++)
		{
		    temp[s.charAt(i)-'a']++;
		}
		int max=0;
		for(int i=0;i<26;i++)
		{
		    if(temp[i]>max)
		    {
		        max=i;
		    }
		}
		char ans=s.charAt(max);
		System.out.println(ans);
		
}
}