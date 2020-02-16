import java.util.Scanner;
import java.lang.Math;
public class Main 
{
	public static void main(String[] args) {
		System.out.print("Please input 3 numbers ensuring to press enter after each input ");
		Scanner input = new Scanner(System.in);
		int firstValue = input.nextInt();
		int secondValue = input.nextInt();
		int thirdValue = input.nextInt();
		input.close();
		
		System.out.println("you have entered your numbers as \n" + firstValue + "\n" + secondValue + "\n"
		+ thirdValue +"\nCalculating average and standard deviation now");
		double total = (firstValue + secondValue + thirdValue);
		double average = total / 3;
		System.out.println("The average of these numbers is " + String.format("%.2f", average));
		
		double standardDeviation = Math.sqrt(Math.pow(total - average, 2) / 3);
		System.out.println("The standard deviation of these numbers is " + String.format("%.2f", standardDeviation));
		
	}

}
