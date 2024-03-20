public class Main
{
    static int DP_Fib(int n,int table[])
    {
        if(n==0||n==1)
         return n;
        else
        {
            if(table[n-2]==-1)
            {
             table[n-2]=DP_Fib(n-2,table);
              if(table[n-1]==-1)
              {
                  table[n-1]=DP_Fib(n-1,table);
              }
            }
            table[n]=table[n-1]+table[n-2];
        }
        return table[n];
    }
    
	public static void main(String[] args) {
		int n=7;
		int []table=new int[n+1];
		for(int i=0;i<table.length;i++)
		{
		    table[i]=-1;
		}
		DP_Fib(n,table);
			for(int i=0;i<table.length;i++)
		{
		    System.out.print(table[i]+" ");
		}
	}
}
