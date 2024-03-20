public class Main
{
    static int BS(int a[],int p,int q,int x)
    {
        if(p==q){
         if(a[p]==x)
          return p;
         else
          return -1;
        }
        else{
            int mid=(p+q)/2;
            if(a[mid]==x)
             return mid;
            else if(x<a[mid])
             return BS(a,p,mid-1,x);
            else
             return BS(a,mid+1,q,x);
        }
    }
	public static void main(String[] args) {
		int a[]={10,20,30,40,50,60,70};
		int x=99;
		System.out.println(BS(a,0,a.length-1,x));
	}
}
