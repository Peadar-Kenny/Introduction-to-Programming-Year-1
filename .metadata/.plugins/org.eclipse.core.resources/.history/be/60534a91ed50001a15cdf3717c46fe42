import java.util.ArrayList;
import java.util.Scanner;
public class ChuckAluck {
	Wallet wallet;
	Dice dice[];


	public static void main(String[] args) {
		boolean finished = false;
		Wallet wallet = new Wallet();
		Scanner input = new Scanner(System.in);
		System.out.println("Please input how much money you want to play with: ");
		int initialCash = input.nextInt();
		wallet.put(initialCash);
		while (finished!=true) {
			System.out.println("Please select which type of bet you want to make: (triple, high, low, field). Or type 'quit'");
			String bet = input.next();
			if(bet == "quit") {
				finished = true;
			}else if(bet == "triple" || bet == "high" || bet == "low" || bet == "field"){
				resolveBet(bet, wallet);
			}
			else {
				System.out.print("Invalid input: Please ensure to type your choice exactly as it is presented in the brackets above, case sensitive ");
			}
		}
	}
	public static void resolveBet(String bet, Wallet wallet) {
		int betInt=0;
		if(bet == "triple")betInt = 1;
		if(bet == "high")betInt = 2;
		if(bet == "low")betInt = 3;
		if(bet == "field")betInt = 4;
		Scanner input = new Scanner(System.in);
		Dice[] dice = new Dice[3];
		boolean betDone = false;
		int diceTotal=0;
		double currentBet; 
		while (betDone != true) {
			System.out.println("You have: €" + wallet.check() + " cash remaining. How much do you want to place on this game?");
			currentBet = input.nextDouble();
			if(wallet.get(currentBet) == true) {
				for (int i = 0; i <= dice.length; i++) {
					dice[i].roll();
					diceTotal += dice[i].topFace();  
				}
					switch (betInt) {
					case 1:
						if(dice[1].topFace()==dice[2].topFace()&& dice[2].topFace() == dice[3].topFace())betWin(currentBet);
						break;
					case 2:
						if(diceTotal >10) betWin(currentBet);
						break;
					case 3:
						if(diceTotal <11)betWin(currentBet);
						break;
					case 4:
						if(diceTotal<=8 && diceTotal >15) {
							System.out.print("You Win! Putting cash back in your wallet");
							current
						}
						break;
					}
					
				
			}
		}
	}

}
