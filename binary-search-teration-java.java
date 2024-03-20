public class Main
{
    static int binarySearch(int arr[],int start,int end,int key)
    {
        while(start<=end)
	   {
	    int mid=start+(end-start)/2;
	    if(arr[mid]==key)
	    {
	        return mid+1;
	    }
	    else if(arr[mid]<key)
	    {
	        start=mid+1;
	    }
	    else 
	    {
	        end=mid-1;
	    }
	    }
	    return -1;
    }
    
	public static void main(String[] args) {
	int arr[]={1,2,3,4,5};
	int n=(arr.length)-1;
	int start=0,end=n,key=5;
	int res=binarySearch(arr,start,end,key);
	System.out.println("Element found at: "+res);
	}
}
