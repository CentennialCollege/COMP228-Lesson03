import java.security.SecureRandom;
import java.util.Scanner;


public class MethodsAndArrays {

	public static void main(String[] args) {
		Game game = new Game(); // instantiates our game object
		
		Scanner input = new Scanner(System.in);
		int numDice = 2; // default number of dice
		int numSides = 6; // default number of sides
		
		
		
		System.out.print("Enter the number of dice: ");
		numDice = input.nextInt();
		
		System.out.print("Enter the number of sides: ");
		numSides = input.nextInt();
		
		System.out.printf("You rolled %d%n",game.rollDice(numDice, numSides));
	}
	
	

}
