
public class Main
{
	public static void main(String[] args) {
		int n=121;
		int n2=0;
		int c=0;
		int temp=n;
		while(temp>0)
		{
		    int r=temp%10;
		    n2=n2+r*(int)Math.pow(10,c);
		    c++;
		    temp=temp/10;
		}
		if(n2==n)
		{
		    System.out.println("Palindrome");
		}
		else
		{
		    System.out.println("Not Palindrome");
		}
	}
}
