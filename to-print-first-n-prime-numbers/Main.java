import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
      Scanner kb=new Scanner(System.in);
      boolean flag=false;
      int num=3;
      int n=kb.nextInt();
      if(n>=1)
      {
          System.out.println("2");
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
              System.out.println(num);
              i++;
          }
          flag=false;
          num++;
      }
      
      
      
      
      
      
      
      
     
    }
}