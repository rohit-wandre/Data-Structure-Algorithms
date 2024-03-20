public class Main
{
    static int binarySearch(int arr[],int start,int end,int key)
    {
        if(end>=start)
        {
        int mid=start+(end-start)/2;
        
        if(arr[mid]==key)
        {
            return mid+1;
        }
        else if(arr[mid]<key)
        {
           return binarySearch(arr,mid+1,end,key);
        }
        else{
           return binarySearch(arr,start,mid-1,key);
        }
        
        }
         return -1;
    }

	public static void main(String[] args) {
    int arr[]={1,2,3,4,5};
    int n=(arr.length)-1;
    int res=binarySearch(arr,0,n,2);
    System.out.println("Element found at: "+res);
}
}
