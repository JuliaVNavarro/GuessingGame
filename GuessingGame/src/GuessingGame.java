import java.util.*;
public class GuessingGame {

	public static void main(String[] args) {
		
		/*initialize scanner*/
		Scanner input = new Scanner(System.in);
		
		/*generate random number between 1 - 100*/
		Random rand = new Random ();
		int rand1 = rand.nextInt(100) + 1;
		
		System.out.print("I'm thingking of a number. Guess a value (1 - 100): ");
		
		/*set user entry = 0 & valid = FALSE*/
		int entry = 0;
		boolean valid = false;
		/*while valid is not false....*/
		while(!valid) {
			/*if the user inputs an integer....*/
			if(input.hasNextInt()) {
				/*then the entry's value is the same value as the user's input*/
				entry = input.nextInt();
				/*if the entry's value is between 1 & 100 then valid is now TRUE*/
				if (entry >= 0 && entry <= 100) {
					valid = true;
				/*otherwise, if the entry is not between 1 & 100
				 *the user will be notified and valid will still
				 *be FALSE and the user will be allowed to try again
				 **/
				}else {
					System.out.println("Invalid Range");
				}
			/* if the user doesn't enter an integer, the invalid string
			 * will be cleared and they will be notified
			 * and will be allowed to try again
			 * */
			}else {
				input.next(); //clear invalid string
				System.out.println("Invalid Input.");
			}
		}
		/*initialize amount of the user's guesses to 0*/
		int guess = 0;
		/* while the user's entry is not the same value as the random number,
		 * it will check to see if the user's entry is higher or lower than
		 * the random number. Each time the user's guess is incorrect, they will
		 * be notified, then the guess will be incremented by one.
		 * */
		while (entry != rand1) {
			if (entry > rand1) {
				System.out.print("Too High.		Guess again: ");
				entry = input.nextInt();
				guess += 1;
			}
			else if(entry < rand1) {
				System.out.print("Too Low.		Guess Again: ");
				entry = input.nextInt();
				guess += 1;
			}
		}
		/* if the user's input is equal to the random number,
		 * then the guess will be incremented once more,
		 * then the user will be notified that the have guessed correctly
		 * in the amount of guesses they attempted.*/
		if (entry == rand1) {
			guess += 1;
			System.out.println("CORRECT!		You got it in " + guess + " tries.");
		}
		
	}

}
