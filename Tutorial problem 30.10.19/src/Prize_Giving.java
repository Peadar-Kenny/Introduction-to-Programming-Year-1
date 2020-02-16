import java.util.Scanner;
public class Prize_Giving {
	public static void main(String[] args) {
		boolean primeNumber = true;
		int numbersChecked = 0;
		int currentNumber = 0;
		int divisor = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Please input the amount of competitors in the tournament ");
		int participants = input.nextInt();
		while (participants >= numbersChecked) {
			numbersChecked++;
			currentNumber = participants - (participants - numbersChecked);
			while (divisor < currentNumber && primeNumber != false)
				divisor++;
				if (currentNumber % divisor == 0) {
					primeNumber = false;
				} else if (currentNumber % divisor !=0) {
					primeNumber = true;
				}
				if (primeNumber == true) {
					System.out.print("The number " + currentNumber + " is a prime number ");
				}
		}
		input.close();
		
	}

}
