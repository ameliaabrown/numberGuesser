package secretNumber;

import java.util.Scanner;

public class guessTheNumber {
	static int difficultyNumber;

	public static void main(String[] args) {

		Scanner userName = new Scanner(System.in);
		Scanner userGuess = new Scanner(System.in);
		Scanner level = new Scanner(System.in);
		Scanner playAgain = new Scanner(System.in);

		System.out.println("What is your name?");
		String name = userName.nextLine();

		boolean repeat = true;
		while (repeat) {
			System.out.println("Hello " + name + ", please choose easy, medium or hard for the diffuculty level.");
			String difficulty = level.nextLine();

			if (difficulty.equals("easy")) {
				System.out.println("Pick a number between 1 and 10");
				difficultyNumber = 10;
			}
			if (difficulty.equals("medium")) {
				System.out.println("Pick a number between 1 and 50");
				difficultyNumber = 50;
			}
			if (difficulty.equals("hard")) {
				System.out.println("Pick a number between 1 and 100");
				difficultyNumber = 100;
			}

			int randomNumber = (int) (Math.random() * difficultyNumber + 1);
			int counter = 0;
			boolean isStillGuessing = true;
			while (isStillGuessing) {
				counter++;
				Scanner input = new Scanner(System.in);
				int guess = userGuess.nextInt();

				if (guess == randomNumber) {
					System.out.println("Good job! You guessed it right! It took you " + counter + " guesses.");
					isStillGuessing = false;
				}

				else if (guess > randomNumber) {
					System.out.println("Guess again! Your guess was too high.");
				} else if (guess < randomNumber) {
					System.out.println("Guess again! Your guess was too low.");
				}
				
				
			}
			System.out.println("Would you like to play again?");
			String play = playAgain.nextLine();
			if (play.equals("no")) {
				System.out.println("Okay, thank you for playing!");
				repeat = false;
			} else {
				repeat = true;
			}

			
		}
	}
}
