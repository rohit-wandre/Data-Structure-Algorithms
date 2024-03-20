import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		 Scanner kb = new Scanner(System.in);
        System.out.println("Enter number of rows and columns");
        int r = kb.nextInt();
        int c = kb.nextInt();
        int arr[][] = new int[r][c];
        int sum = 0;
        double avg = 0.0;
         System.out.println("Enter elements:");
        for(int i = 0; i<r; i++)
        {
            for(int j = 0; j<c; j++)
            {
               arr[i][j] = kb.nextInt();
            }
            
        }
        for(int i = 0; i<r; i++)
        {
            for(int j = 0; j<c; j++)
            {
                sum += arr[i][j];
            }
            avg = sum/(r + c);
        }
        System.out.println("Sum of all the numbers is : " + sum);
        System.out.println("Avg of all the numbers is : " + avg);
	}
}
