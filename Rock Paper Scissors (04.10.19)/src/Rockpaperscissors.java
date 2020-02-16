/* SELF ASSESSMENT
   1. Did I use appropriate easy-to-understand, meaningful variables and CONSTANTS within the code? 
       Mark out of 10: 10
       Comment: I didn't use any constants and I feel my vairiable names are easy to follow
   2. Did I format the variable and CONSTANT names appropriate (in lowerCamelCase and UPPERCASE)?
       Mark out of 5: 
       Comment: All variable names formatted properly
   3. Did I generate the computer's choice in each game correctly using a Random number generator?
       Mark out of 10: 10
       Comment: The number was randomised each time
   4. Did I input the user's choice in each game correctly?
       Mark out of 10: 10
       Comment: All user inputs were taken and used appropriately
   5. Did I correctly compare the choices and update the score appropriately?
       Mark out of 20: 20
       Comment: I have not run into an instance where the comparison was not completed correctly
   6. Did I inform the user of who won each game (and why) correctly?
       Mark out of 10: 10
       Comment: The user is kept fully informed as to the results of each game
   7. Did I use an appropriate for loop to allow the player to play 5 games?  There should be only one loop.
       Mark out of 20: 20 
       Comment: I used a single for loop such that the user can select their own amount of games
   8. Did I output the final scores correctly after the 5 games were played. 
       Mark out of 10: 10
       Comment: The final score is always output correctly at the end of a game
   9. How well did I complete this self-assessment?
       Mark out of 5: 5
       Comment: I feel that all my scores are fair for the work I have done
   Total Mark out of 100 (Add all the previous marks): 100
*/
import java.util.Random;
import java.util.Scanner;

public class Rockpaperscissors {
	public static void main(String[] args) {
		System.out.print("How many games do you want to play? ");
		Scanner input = new Scanner (System.in);
		int userRound = input.nextInt();
		int userScore = 0;
		int aiScore = 0;
		final int ROCK = 1;
		final int PAPER = 2;
		final int SCISSORS = 3;
		
		
		for (int roundCount = 1; roundCount <= userRound; roundCount++ ) {
			Random random = new Random();
			System.out.println("Round:" + roundCount);
			System.out.println("The score is currently: User:" + userScore + " Computer:" + aiScore);
			System.out.println("Please select either Rock(1), Paper(2), Scissors(3)");
			int userChoice = input.nextInt();
			int aiChoice = random.nextInt(3);
			aiChoice++;
			if (userChoice > SCISSORS || userChoice < ROCK ) {
				System.out.println("Please make a valid selection, this round counts as a loss");
			    aiScore++;
			}
			
			
			if (userChoice == ROCK) {
				if (aiChoice == PAPER) {
					System.out.println("The computer has chosen Paper, you have chosen rock, the computer wins the round!");
					aiScore++;
				}
				else if (aiChoice == ROCK) {
					System.out.println("You and the computer have both chosen rock, this round is a draw!");
					roundCount--;
				}
				else if (aiChoice == SCISSORS) {
					System.out.println("You have chosen rock, the computer has chosen scissors, you win the round!");
					userScore++;
				}
			}
			
			
			else if (userChoice == PAPER) {
				if (aiChoice == ROCK) {
					System.out.println("You chose paper, the computer chose rock, you win the round!");
					userScore++;
				}
				else if(aiChoice == PAPER) {
					System.out.println("You and the computer have both chosen paper, this round is a draw!");
					roundCount--;
				}
				else if (aiChoice == SCISSORS) {
					System.out.println("The computer has chosen scissors, you have chosen paper, the computer wins the round!");
					aiScore++;
				}
			}
			
			
			else if (userChoice == SCISSORS) {
				if (aiChoice == ROCK) {
					System.out.println("The computer has chosen rock, you have chosen scissors, the computer wins the round!");
					aiScore++;
				}
				else if (aiChoice == PAPER) {
					System.out.println("You have chosen scissors, the computer has chosen paper, you win the round!");
					userScore++;
				}
				else if (aiChoice == SCISSORS) {
					System.out.println("You have both chosen scissors, this round is a draw!");
					roundCount--;
				}
			}
		}
		System.out.println("The game is over! The final score was: User:" + userScore + " Computer:" + aiScore);
		if (userScore > aiScore) {
			System.out.println("You have won, congratulations!");
		}
		else if (aiScore > userScore) {
			System.out.println("The computer has won this game, better luck next time");
		}
		else if (userScore == aiScore) {
			System.out.println("The game has ended in a draw, well done!");
		}
		input.close();
	}
}