public class Main
{
	public static void main(String[] args) {
	 int arr[]={100,200,300,400,500,600,700,800};
	 for(int i=0;i<arr.length-2;i++)
	 {
	     int b=i+1,c=arr.length-1;
	     while(b!=c)
	     {
	         if(arr[i]+arr[b]+arr[c]==1000)
	         {
	          System.out.println(arr[i]+"+"+arr[b]+"+"+arr[c]+"="+"1000");
	          break;
	         }
	         else
	         {
	             if(arr[i]+arr[b]+arr[c]<1000)
	              b++;
	             else
	              c--;
	         }
	     }
	 }
	}
}
