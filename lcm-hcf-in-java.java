public class Main
{
    
    static int gcd(int a,int b)
	{
	    if(b==0)
	    {
	        return a;
	    }
	    return gcd(b,a%b);
	}
    
    
    public static void main(String[] args) {
	int n1=12;
	int n2=48;
	int hcf=gcd(n1,n2);
	int lcm=(n1*n2)/hcf;
	System.out.println("HCF= "+hcf);
	System.out.println("LCM= "+lcm);
	
	}
}
