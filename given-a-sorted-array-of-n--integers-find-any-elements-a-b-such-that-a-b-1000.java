public class Main
{
    static void fun(int a[])
    {
        int p=0,q=a.length-1;
        while(p!=q)
        {
            if(a[p]+a[q]==1000)
            {
             System.out.println(a[p]+" "+a[q]);
             break;
            }
            else
            {
                if(a[p]+a[q]<1000)
                 p++;
                else
                 q--;
            }
        }
    }
	public static void main(String[] args) {
		int a[]={100,200,300,400,500,600,700,800};
		fun(a);
	}
}
