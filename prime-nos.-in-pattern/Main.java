import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
      Scanner kb=new Scanner(System.in);
      boolean flag=false;
      int num=3;
      int n=kb.nextInt();
      int arr[]=new int[n];
      int k=0;
      
      if(n>=1)
      {
          //System.out.println("2");
          arr[k++]=2;
      }
      for(int i=2;i<=n;)
      {
          for(int j=2;j<=Math.sqrt(num);j++)
          {
              if(num%j==0)
              {
                  flag=true;
                  break;
              }
          }
          if(!flag)
          {
              //System.out.println(num);
              i++;
              arr[k++]=num;
          }
          flag=false;
          num++;
          
      }
      
      for(int i=0;i<n;i++)
      {
          //System.out.print("1"+" ");
          for(int j=0;j<=i;j++)
          {
              
              System.out.print(arr[j]+" ");
          }
          System.out.println();
      }
      
      
    /*   -------------- reverse half------------------
      for(int i=0;i<n-1;i++)
      {
          for(int j=0;j<n-i-1;j++)
          {
               System.out.print(arr[j]+" ");
          }
          System.out.println();
      }
      
    */  
      
      
     
    }
}