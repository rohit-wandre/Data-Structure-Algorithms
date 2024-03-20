public class Main
{
   static int max,min;
	static void straightMinMax(int a[])
	{
	    min=max=a[0];
	    for(int i=1;i<a.length;i++)
	    {
	        if(max<a[i])
	        {
	            max=a[i];
	        }
	        else
	        {
	            if(min>a[i])
	            {
	                min=a[i];
	            }
	        }
	    }
	}
	public static void main(String[] args) {
		int a[]={17,5,210,5,88,99,11,10};
		straightMinMax(a);
		System.out.println("Minimum element-> "+min);
		System.out.println("Maximum element-> "+max);
	}
}
