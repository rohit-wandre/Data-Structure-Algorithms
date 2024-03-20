public class Main
{
    static String x="BABABA";
	    static String y="ABABAB";
    static int LCS(int m,int n)
    {
        if(m==0||n==0)
         return 0;
        else
        {
            if(x.charAt(m-1)==y.charAt(n-1))
            {
                return 1+LCS(m-1,n-1);
            }
            else
            {
                int a=LCS(m-1,n);
                int b=LCS(m,n-1);
                return Math.max(a,b);
            }
        }
    }
	public static void main(String[] args) {
	    
	    System.out.println(LCS(x.length(),y.length()));
	}
}
