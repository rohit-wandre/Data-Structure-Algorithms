
public class Main
{
    static int power(int base,int a)
    {
        if(a!=0)
        {
            return base*power(base,a-1);
        }
        else
        {
            return 1;
        }
    }
    
	public static void main(String[] args) {
	
	int base=2,a=2;
	int res=power(base,a);
	System.out.println(res);
	}
}
