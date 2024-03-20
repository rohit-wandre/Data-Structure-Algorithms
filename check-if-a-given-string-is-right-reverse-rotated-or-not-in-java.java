public class Main
{
	public static void main(String[] args) {
		String s1="sample";
		String s2="plesam";
		boolean flag=false;
		int n1=s1.length();
		int n2=s2.length();
		if(n1!=n2)
		{
		    System.out.println("unequal strings");
		    System.exit(0);
		}
		int i=s1.indexOf(s2.charAt(0));
		for(int j=0;j<n2;j++)
		{
		    if(s1.charAt(i)!=s2.charAt(j))
		    {
		        flag=true;
		        break;
		    }
		    i=(i+1)%n1;
		}
		if(flag)
		{
		    System.out.println("Not reverse rotated");
		}
		else
		{
		    System.out.println("reverse rotated");
		}
	}
}
