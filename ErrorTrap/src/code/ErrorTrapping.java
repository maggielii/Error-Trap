package code;

import java.util.Scanner;

public class ErrorTrapping {

	public static void main(String[] args) {
		
		/*Ask user for a number from one to ten
		 * Program only accepts numbers from one to ten 
		 * anything else entered it will ask again
		 */
		
		Scanner input = new Scanner(System.in);

		int number = 0;
		int min = 3, max = 7;
		
		do 
		{
			try //acknowledging this section might not work, if doesn't work get error 
			{
				System.out.print("Enter a number from " + min + " to " + max + ": ");	
				number = input.nextInt();
			}
			catch(Exception e)//if there's exception titled e, catch exception before gets to user
			{
				System.out.println("Invalid input");
				input.next(); //clear stream, old is gone
			}
			
		}while(number > max || number < min);
		
		System.out.println("The number was: " + number);

		
	}

}

