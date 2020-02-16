import java.util.Scanner;
import java.util.Random;
public class Game {
	public static void main(String[] args) {
		final int JACK = 11;
		final int QUEEN = 12;
		final int KING = 13;
		int gamesPlayed = 0;
		boolean higherCard = true;
		boolean firstGame = true;
		Scanner input = new Scanner(System.in);
		System.out.print("Please input how many games you wont to play. ");
		int userGames = input.nextInt();
		while ( gamesPlayed <= userGames ) {
			gamesPlayed++;
			int computerChoice = Random.nextInt(13);
			computerChoice++;
			while(firstGame != true) {
				System.out.print("the computer has chosen" + computerChoice + "please indicate if you think that the "
						+ "next card will be either higher or lower");
				input.next();
				firstGame = false;
			}
			if (computerChoice == JACK) {
				System.out.print("The computer has chosen jack");
			}else if(computerChoice == QUEEN) {
				System.out.println("The computer has chosen queen");
			}else if(computerChoice == KING) {
				System.out.println("The compter has chosen king")
			
			}else {
				System.out.println("The computer has chosen " + computerChoice); 
			}
			System.out.println("Please state wether you think that the next card picked will "
					+ "be higher, lower or equal to the previous card");
			input.hasNext();
		  
		}
		
	}

}
