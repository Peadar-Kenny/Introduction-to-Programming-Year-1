import java.util.Scanner;
public class Positiveintegers {
	public static void main(String[] args) {
		final int MINIMUMNUMBER = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your base number (the number you want to find the multiples of) ");
		int baseNumber = input.nextInt();
		
		System.out.print("Thank you, please enter the range (the highest number you want to go up to) ");
		int maxNumber = input.nextInt();
		
		input.close();
		
		System.out.print("Your base number is " + baseNumber + " and your maximum number is " + maxNumber + " ");
		
		for (int multiple = 0; multiple <= maxNumber; multiple = multiple + baseNumber) {
			System.out.println("multiple of " + baseNumber + " = " + multiple);
		}
		if (baseNumber <= MINIMUMNUMBER || maxNumber <= MINIMUMNUMBER)
			System.out.print("Please do not enter a number that is less than one");
		
		if (baseNumber > maxNumber)
			System.out.println("Please do not enter a base number that is larger than your maximum number");
		
		
	
	
	}
	
	

}
