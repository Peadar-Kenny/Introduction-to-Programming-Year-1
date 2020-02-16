import java.util.Scanner;
import java.util.Arrays;
public class second_etest {

	public static void main(String[] args) {
		boolean finished = false;
		int counter = 0;
		int[] values = new int[0];
		while (!finished) {
			System.out.println("Enter an integer to add to the array (or 'quit' to finish)");
			Scanner input = new Scanner(System.in);
			if(input.hasNextInt()) {
				int number = input.nextInt();
				values = Arrays.copyOf(values, values.length+1);
				values[counter] = number;
				counter++;
			}else if (input.hasNext("quit")) {
				finished = true;
			} else {
				System.out.print("Please make a valid selection");
			}
			System.out.print("The minimum value is " + getMinimumValue(values, counter) + 
					" and the values are" + isPalindromic(values, counter));
		}

	}
	
	public static int getMinimumValue(int[] values, int counter) {
		int currentNumber = 0;
		int minimumNumber= values[currentNumber];
		while ( currentNumber < counter) {
			if(values[currentNumber] < minimumNumber) {
				values[currentNumber] = minimumNumber;
			}
			currentNumber++;
		}
		return minimumNumber;
	}
	public static String isPalindromic(int[] values, int counter) {
		boolean checkFinished = false;
		int currentValue = 0;
		boolean palindromic = false;
		counter = counter - 1;
		while (checkFinished == false) {
			int upperNumber = counter - currentValue;
			if(values[currentValue] == values[upperNumber]) {
				currentValue++;
				if(currentValue > (counter/2) - currentValue) {
					palindromic = true;
					checkFinished = true;
				}
			}else if(values[currentValue] != values[counter-currentValue]) {
				checkFinished = true;
				palindromic = false;
			}
		
	}
		counter = counter+1;
		if (palindromic == true) {
			return " palindromic.\n";
		}else {
			return " not palindromic.\n";
		}
	}

}
