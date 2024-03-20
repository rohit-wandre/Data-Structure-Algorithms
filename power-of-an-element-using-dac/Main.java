public class Main
{
    
    static int DAC_power(int a,int n)
    {
        if(n==1)
         return a;
        else
        {
            int mid=n/2;
            int b=DAC_power(a,mid);
            int c=b*b;
            if(n%2==0)
             return c;
            else
             return a*c;
        }
    }
	public static void main(String[] args) {
		int a=3,n=3;
		System.out.println(DAC_power(a,n));
	}
}
