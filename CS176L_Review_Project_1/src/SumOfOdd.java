import java.util.Scanner;

public class SumOfOdd 
{

	public static void main(String[] args) 
	{
		Scanner num = new Scanner(System.in);
		
		System.out.println("Enter a positive integer: ");
		int posInt = num.nextInt();
		
		int oddNumb = 1;
		int sum = 0;
		
		System.out.println();
		System.out.println("The first " + posInt + " positive integers are: ");
		
		for(int i = 1; i <= posInt; i++)
		{
			
			System.out.print(oddNumb + ", ");
			
			sum += oddNumb;
			oddNumb += 2;
		}
		System.out.println("\n");
		System.out.println("The sum of the first " + posInt + " positive odd integers is: ");
		System.out.print(sum);
	}
}
