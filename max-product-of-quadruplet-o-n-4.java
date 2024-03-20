
public class Main
{
	public static void main(String[] args) {
	
	int arr[]={1,-4,3,-6,7,0};
	int n=arr.length;
	int max=0;
	System.out.println(max);
	for(int i=0;i<n-3;i++)
	{
	    for(int j=i+1;j<n-2;j++)
	    {
	        for(int k=j+1;k<n-1;k++)
	        {
	            for(int l=k+1;l<n;l++)
	            {
	                max=Math.max(max,arr[i]*arr[j]*arr[k]*arr[l]);
	            }
	        }
	    }
	}
	System.out.print(max);
	
	}
}
