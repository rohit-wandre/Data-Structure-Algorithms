
public class Main
{
	public static void main(String[] args) {
		
		int n=1001;
		int temp=n;
		int s=0,i=0;
		while(temp>0)
		{
		    int r=temp%10;
		    s=s+r*(int)Math.pow(2,i);
		    temp=temp/10;
		    i++;
		}
		System.out.println("Binary form is: "+n);
		System.out.print("Decimal form is "+s);
		
	}
}
