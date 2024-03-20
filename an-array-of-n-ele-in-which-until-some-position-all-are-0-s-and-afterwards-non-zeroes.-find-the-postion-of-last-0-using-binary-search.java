public class Main
{
    static int BS(int a[],int i,int j)
    {
        if(i==j)
         return i;
        else
        {
            int mid=(i+j)/2;
            if(a[mid]==0&&a[mid+1]!=0)
             return mid;
            else{                                      // O(logn)
             if(a[mid]==0&&a[mid+1]==0)
              return BS(a,mid+1,j);
             else
              return BS(a,i,mid-1);
            }
        }
    }
	public static void main(String[] args) {
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		int a[]={0,0,0,0,0,0,0,0,0,0,2,3,4,5,6};
	    System.out.println(BS(a,0,a.length-1));
	}
}
