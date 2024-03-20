
public class Main
{
	public static void main(String[] args) {
		
		
		
		String s="rohit is is best";
		String r="is";
		int c=0;
		int l1=s.length();
		int l2=r.length();
		int i=0,j=0;
		while(i<l1)
		{
		    if(s.charAt(i)==r.charAt(j))
		    {
		        j++;
		    }
		    if(j==l2)
		    {
		        c++;
		        j=0;
		    }
		    i++;
		}
		System.out.println(c);
	}
}
