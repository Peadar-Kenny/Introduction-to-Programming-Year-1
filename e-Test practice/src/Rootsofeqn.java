import java.util.Scanner;
public class Rootsofeqn {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		boolean numberEntered = false;
		System.out.print("Enter the coefficients of your second order polynomial seperated by spaces ");
		if (input.hasNextInt()) {
			numberEntered = true;
		}
		if (numberEntered == false) {
			System.out.print("You have made an inalid selection, closing the program");
			System.exit(1);
		}
		if (numberEntered == true) {
			a = input.nextInt();
			b = input.nextInt();
			c = input.nextInt();
		}
		System.out.println("You have chosen " + a + ", " + b + " and " + c + " as your coefficients.");
		input.close();
		int squareRoot = (int) Math.sqrt((b*b) -(4)*(a)*(c));
		int firstRoot = ((b*-1) + squareRoot)/2*a;
		int secondRoot = ((b*-1)- squareRoot)/2*a;
		
		System.out.println("The roots of your equation are: X = " + firstRoot + ", X = " + secondRoot );
		
	}

}
