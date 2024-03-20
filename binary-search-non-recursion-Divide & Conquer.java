public class Main
{
    static int BS(int a[],int i,int j,int x)
    {
        while(i<=j)
        {
            if(i==j)
            {
                if(a[i]==x)
                 return i;
                else
                 return -1;
            }
            else
            {
                int mid=(i+j)/2;
                if(x<a[mid])
                 j=mid-1;
                else
                 i=mid+1;
            }
        }
        return -1;
    }
	public static void main(String[] args) {
		int a[]={10,20,30,40,50,60};
		System.out.println(BS(a,0,a.length-1,60));
	}
}
