public class Main
{
	public static void main(String[] args) {
		
		int arr[]={1,1,2};
		int n=arr.length;
		int j=0;
		for(int i=0;i<n-1;i++)
		{
		   if(arr[i]!=arr[i+1])
		   {
		       arr[j++]=arr[i];
		   }
		}
		arr[j++]=arr[n-1];
		
		System.out.println(j);
	}
}
