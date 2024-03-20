public class Main
{
    static int gcd(int a, int b)
    {
        if(b == 0)
        {
            return a;
        }
        return gcd(b,a%b);
    }
    
    
    static int calcLCM(int arr[])
    {
        int ans = arr[0];
        for(int i = 0; i < arr.length; i++)
        {
            ans = (arr[i]*ans) / gcd(arr[i],ans);
        }
        return ans;
    }
    
    
    
	public static void main(String[] args) {
		
		int [] arr = {2,7,3,9,4};
		System.out.println(calcLCM(arr));
		
	}
}
