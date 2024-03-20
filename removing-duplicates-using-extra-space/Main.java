public class Main
{
	public static void main(String[] args) {
		int nums[]={0,0,1,1,2,2,3};
		int n=nums.length;
		int temp[]=new int[n];
		int i=0,k=0;
		while(i<n-1)
		{
		    if(nums[i]!=nums[i+1])
		    {
		        temp[k++]=nums[i];
		    }
		    i++;
		}
		temp[k++]=nums[n-1];
		for(int a=0;a<k;a++)
		{
		    System.out.print(temp[a]+" ");    
		}
	}
}
