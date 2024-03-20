public class Main
{
    static int partition(int a[],int p,int q)
    {
        int x=a[p];
        int i=p;
        for(int j=i+1;j<=q;j++)
        {
            if(a[j]<=x)
            {
                i++;
                int temp=a[j];
                a[j]=a[i];
                a[i]=temp;
            }
        }
        int temp=a[i];
        a[i]=a[p];
        a[p]=temp;
        return i;
    }
    static int SP(int a[],int p,int q,int k)
    {
        if(p==q)
         return a[p];
        else
        {
            int m=partition(a,p,q);
            if(k==m)
             return a[m];
            if(k<m)
             return SP(a,p,m-1,k);
            else
             return SP(a,m+1,q,k);
        }
    }
    
	public static void main(String[] args) {
	   int a[]={10,9,3,4,7,99};
	   int k=3;
	  int res=SP(a,0,5,k-1);
	   for(int i:a)
	   {
	       System.out.print(i+" ");
	   }
	   System.out.println();
	   System.out.println(k+"th smallest element is: "+res);
	}
}
