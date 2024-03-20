public class Main
{
    static int BS(int a[],int i,int j)
    {
        if(i==j)
        {
            if(a[i]==i)
             return i;
            else 
             return -1;
        }
        else
        {
            int mid=(i+j)/2;
            if(a[mid]==mid)
             return mid;
            else
            {
                if(a[mid]>mid)
                 return BS(a,mid+1,j);
                else 
                 return BS(a,i,mid-1);
            }
        }
    }
	public static void main(String[] args) {
		int a[]={-50,-40,-30,-5,-2,0,3,5,9,20,30,80,100,150,200};
		System.out.println(BS(a,0,a.length-1));
	}
}
