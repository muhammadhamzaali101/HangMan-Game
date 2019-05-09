import java.util.Scanner;

public class Hangman
{
	public static void main (String [] args)
	{
		
		
		System.out.println("############################################\n Welcome To The lab Task1b : Hangman Game !!\n############################################");
		int attempts = 1;
		
		final String answer = "PAKISTAN"  ;
		String guess  ;
		
		System.out.println("=======================\n|\t\t||\n|\t\t||");
		
		Scanner input = new Scanner(System.in);
		
		while (attempts <= 5 )
		{
			System.out.println("Guess the Word");
			
			guess= input.nextLine();
			
			guess=guess.toUpperCase();
			if (answer.equals(guess))
			{
				System.out.println("Congrats! You Won!!");
				break;
			}
			else
			{
				switch (attempts)
				{
					
					
					case 1:
					System.out.printf("WRONG\n========================\n|\t\t||\n|\t\t||\n|\t       -   - \n| \t \t--\n");
					break;
					
					case 2:
					System.out.printf("WRONG\n========================\n|\t\t||\n|\t\t||\n|\t       -   - \n| \t \t-- \n| \t \t||\n");
					break;
					
					case 3:
					System.out.printf("WRONG\n========================\n|\t\t||\n|\t\t||\n|\t       -   - \n| \t \t-- \n| \t \t||\n| \t     -------\n|     \t    |\t   | \n|     \t    |\t   | \n|\t     -------\n");
					break;
					
					case 4:
					System.out.printf("WRONG\n========================\n|\t\t||\n|\t\t||\n|\t       -   - \n| \t \t-- \n| \t \t||\n| \t     -------\n|     \t    |\t   | \n|     \t    |\t   | \n|\t     -------\n|\t     ||  ||\n\t     ||  ||\n");
					break;
					
					case 5:
					System.out.printf("WRONG\n========================\n|\t\t||\n|\t\t||\n|\t       -   - \n| \t \t-- \n| \t \t||\n| \t     -------\n|     \t    |\t   | \n|     \t    |\t   | \n|\t     -------\n|\t     ||  ||\n\t     ||  ||\n|\t     === ===\n");
					System.out.println("Game lost!!\n Better Luck next Time");
					break;
					
				}
			}
			attempts++ ;
		}
		
	}
}
