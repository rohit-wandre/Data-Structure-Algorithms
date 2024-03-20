public class Main
{
    static boolean BS(int a[],int i,int j,int t)
    {
        int mid=(i+j)/2;
        if(t+a[mid]==1000)
        {
         System.out.println(t+"+"+a[mid]+"="+"1000");
         return true;
        }
        else
        {
            if(t+a[mid]<1000)
            {
                if(mid<a.length-1)
                {
                    BS(a,mid+1,j,t);
                }
                else
                {
                    return false;
                }
                
            }
            else
            {
                BS(a,i,mid-1,t);
            }
        }
        return false;
    }
	public static void main(String[] args) {
	 int a[]={100,200,300,400,500,600,700,800};
	 for(int i=0;i<a.length-1;i++)
	 {
	     int t=a[i];
	     if(BS(a,i+1,a.length-1,t))
	     {
	          break;
	     }
	     
	 }
	}
}
