import java.util.Scanner;
public class MinMaxnumbers {
	public static void main(String[] args) {
		boolean firstNumber = true;
		int lowestNumber = 0;
		int highestNumber = 0;
		System.out.println("please input numbers, seperate them with a space");
		Scanner input = new Scanner(System.in);
		while (input.hasNextInt()){
			if (firstNumber == true) {
				lowestNumber = input.nextInt();
				highestNumber = input.nextInt();
				firstNumber = false;
			} else if (input.nextInt() > highestNumber ) {
				highestNumber = input.nextInt();
			} else if (input.nextInt() > lowestNumber) {
				lowestNumber = input.nextInt();
			}
			
		}
		System.out.println("the maximum of the numbers you entered is " + highestNumber + ". The lowest of the numbers you entered is " + lowestNumber + ".");

	}

}
