
public class Main
{
	public static void main(String[] args) {
		
		int arr[]={-1,-2,5,0,-1,2,6,-2};
		int n=arr.length;
		int curr_sum=0,max_sum=0;
		for(int i=0;i<n;i++)
		{
		    curr_sum+=arr[i];
		    if(curr_sum<0)
		    {
		        curr_sum=0;
		    }
		    if(curr_sum>max_sum)
		    {
		        max_sum=curr_sum;
		    }
		}
		System.out.println(max_sum);
		
		
	}
}
