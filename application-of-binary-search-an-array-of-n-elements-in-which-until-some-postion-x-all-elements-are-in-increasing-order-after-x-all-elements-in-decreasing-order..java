public class Main
{
    static int BS(int a[],int i,int j)
    {
        if(i==j)
         return i;
        else
        {
            int mid=(i+j)/2;
            if(a[mid]>a[mid+1]&&a[mid]>a[mid-1])
            {
                return mid;
            }
            else
            {
                if(a[mid]<a[mid+1])
                {
                    return BS(a,mid+1,j);
                }
                else
                 return BS(a,i,mid-1);
            }
        }
    }
	public static void main(String[] args) {
	 int a[]={10,20,30,40,50,60,70,80,60,40,30,20};
	 System.out.println(BS(a,0,a.length-1));
	}
}
