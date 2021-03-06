/* SELF ASSESSMENT

1. ResolveBet

I have correctly defined ResolveBet which takes the bet type (String) and the Wallet object, and a void return type [Mark out of 7: 7].
Comment: ResolveBet is programmed as defined
My program presents the amount of cash in the wallet and asks the user how much he/she would like to bet [Mark out of 8: 8].
Comment: This is done in the program
My program ensures the bet amount is not greater than the cash in the wallet [Mark out of 5: 5].
Comment: This is done in the program
My program creates three Dice objects, rolls them and creates a total variable with a summation of the roll values returned [Mark out of 15: 15].
Comment: This is done in the program
My program determines the winnings by comparing the bet type with the total and comparing the bet type with the dice faces for the triple bet [Mark out of 20: 20].
Comment: This is done in the program
My program outputs the results (win or loss) and adds the winnings to the wallet if user wins or removes the bet amount from the wallet if the user loses [Mark out of 10: 10 ].
Comment: This is done in the program

2. Main

I ask the user for the amount of cash he/she has, create a Wallet object and put this cash into it [Mark out of 15: 15 ]
Comment: This is done in the program
My program loops continuously until the user either enters quit or the cash in the wallet is 0 [Mark out of 5: 5 ]
Comment: This is done in the program
I ask the user to enter any of the four bet types or quit [Mark out of 5: 5 ].
Comment: This is done in the program
My program calls resolveBet for each bet type entered [Mark out of 5: 5].
Comment: This is done in the program
At the end of the game my program presents a summary message regarding winnings and losses [Mark out of 5: 5]
Comment: This is done in the program

 Total Mark out of 100 (Add all the previous marks): 100
*/
import java.util.Scanner;
public class ChuckAluck {
	Wallet wallet;
	Dice dice[];


	public static void main(String[] args) {
		boolean finished = false;
		double initialCash = 0;
		Wallet wallet = new Wallet();
		Scanner input = new Scanner(System.in);
		boolean betOk= false;
		while(betOk!= true) {
			System.out.println("Please input how much money you want to play with: ");
			initialCash = input.nextDouble();
			if (initialCash >0){
				betOk = true;
			}
		}
		wallet.put(initialCash);
		while (finished!=true){
			System.out.println("Please select which type of bet you want to make: (triple, high, low, field). Or type 'quit'");
			String bet = input.next();
			if(bet.equals("quit")) {
				finished = true;
			}else if(bet.equals("triple") || bet.equals("high") || bet.equals("low") || bet.equals("field")){
				resolveBet(bet, wallet);
			}else if (wallet.check()<=0) {
				finished = true;
			}
			else {
				System.out.print("Invalid input: Please ensure to type your choice exactly as it is presented in the brackets above, case sensitive ");
			}
			if(wallet.check() <=0) {
				finished = true;
			}
		}
		System.out.println("Game over! you ended the game with �" + wallet.check() + " you started with �" + initialCash 
				+". This is a net Gain/Loss of " + (wallet.check() - initialCash) + " euro.");

	}
	public static void resolveBet(String bet, Wallet wallet) {
		int betInt=0;
		if(bet.equals("triple"))betInt = 1;
		if(bet.equals("high"))betInt = 2;
		if(bet.equals("low"))betInt = 3;
		if(bet.equals("field"))betInt = 4;
		Scanner input = new Scanner(System.in);
		Dice[] dice = new Dice[3];
		for (int i=0; i<dice.length; i++) {
			dice[i] = new Dice();
		}
		boolean betDone = false;
		int diceTotal=0;
		double currentBet;
		while (betDone != true) {
			System.out.println("You have: �" + wallet.check() + " cash remaining. How much do you want to place on this game?");
			currentBet = input.nextFloat();
			if(wallet.get(currentBet) == true) {
				for(int i = 0; i < dice.length; i++) {
					dice[i].roll();
					diceTotal += dice[i].topFace();
				}
				System.out.println("The die's roll's were " + dice[0].topFace() 
						+ ", " + dice[1].topFace() + " and " + dice [2].topFace() +"\nThe total of the die was "
						+ diceTotal);
				switch (betInt) {
				case 1:
					if(dice[1].topFace()==dice[2].topFace()&& dice[2].topFace() == dice[0].topFace()) {
						wallet.put(currentBet*30);
						System.out.println("You win! putting �" + currentBet*30 + " into your wallet");
					}
					else {
						System.out.println("You lose, your bet has been deducted from your wallet");
					}
					betDone = true;
					break;
				case 2:
					if(diceTotal >= 11) {
						wallet.put(currentBet*2);
						System.out.println("You win! putting �" + currentBet + " into your wallet");	
					}
					else {
						System.out.println("You lose, your bet has been deducted from your wallet");
					}
					betDone = true;
					break;
				case 3:
					if(diceTotal <= 10) {
						wallet.put(currentBet*2);
						System.out.println("You win! putting �" + currentBet + " into your wallet");	
					}else{
						System.out.println("You lose, your bet has been deducted from your wallet");
					}
					betDone = true;
					break;
				case 4:
					if(diceTotal<=8 && diceTotal >15) {
						wallet.put(currentBet*2);
						System.out.println("You win! putting �" + currentBet + " into your wallet");	
					}else{
						System.out.println("You lose, your bet has been deducted from your wallet");
					}
					betDone = true;
					break;
				}


			}
			else {
				System.out.print("You either entered an invalid input, please enter a valid input.");
			}
		}
		
	}


}
