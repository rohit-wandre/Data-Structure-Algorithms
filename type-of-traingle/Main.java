import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter sides of the traingle");
		int a=kb.nextInt();
		int b=kb.nextInt();
		int c=kb.nextInt();
		if(a==b&&b==c&&a==c)
		{
		    System.out.println("Equilateral traingle");
		}
		else if(a==b&&a==c&&b!=c){
		    System.out.println("isoceles triangle");
		}
		else if(a!=b&&b!=c&&a!=c){
		    System.out.println("right angled triangle");
		}
		else
		{
		    System.out.println("Not triangle");
		}
	}
}
