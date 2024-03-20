import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner kb = new Scanner(System.in);
	int row, col, sum = 0,c = 0;
	double avg;
	System.out.println("Enter number of rows");
	row = kb.nextInt();
	//col = kb.nextInt();
	int [][] arr = new int [row][];
	for(int i = 0; i<arr.length; i++)
	{
	    System.out.println("Enter number of columns for "+(i+1)+" th row");
	    col = kb.nextInt();
	    arr[i] = new int [col];
	    System.out.println("Enter number of elements for column ");
	    for(int j = 0; j<arr[i].length; j++)
	    {
	        arr[i][j] = kb.nextInt();
	    }
	}
	
	for(int i = 0; i < arr.length; i++)
	{
	    for(int j = 0; j < arr[i].length; j++)
	    {
	        sum += arr[i][j];
	        c++;
	    }
	}
	avg = sum / c;

	System.out.println("Sum is "+sum);
	System.out.println("Avg is "+avg);
	}
}
