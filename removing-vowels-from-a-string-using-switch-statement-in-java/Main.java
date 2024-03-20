
public class Main
{
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("rohit");
      for(int i=0;i<sb.length();i++)
      {
           switch(sb.charAt(i))
           {
               case 'a':case 'e':case 'i':case 'o':case 'u':
                   sb.deleteCharAt(i);
                      i--;
           }
        
        // if(sb.charAt(i)=='a'||sb.charAt(i)=='e'||sb.charAt(i)=='i'||sb.charAt(i)=='o'||sb.charAt(i)=='u')
        // {
        //     sb.deleteCharAt(i);
        //     i--;
        // }
        
      }
      System.out.println(sb);
    }
	}
}
