/*  SELF ASSESSMENT
   1. Did I use appropriate CONSTANTS instead of numbers within the code?
       Mark out of 10: 10
       Comment:
   2. Did I use easy-to-understand, meaningful CONSTANT names?
       Mark out of 5: 5 
       Comment:
    3. Did I format the CONSTANT names properly (in UPPERCASE)?
       Mark out of 5: 5
       Comment:
   4. Did I use easy-to-understand meaningful variable names?
       Mark out of 10: 8 
       Comment:
   5. Did I format the variable names properly (in lowerCamelCase)?
       Mark out of 10:  10
       Comment:
   6. Did I indent the code appropriately?
       Mark out of 10:  10
       Comment:
   7. Did I read the input correctly from the user using appropriate question(s)?
       Mark out of 10:  9
       Comment:
   8. Did I compute the disposable income correctly?
       Mark out of 10:  10
       Comment:
   9. Did I compute the disposable income percentage correctly?
       Mark out of 10:  10
       Comment:
   10. Did I output the correct answer in the correct format (as shown in the examples)?
       Mark out of 10:  8
       Comment:
   11. How well did I complete this self-assessment?
       Mark out of 10:  10
       Comment:
   Total Mark out of 100 (Add all the previous marks): 95  
*/
import java.util.Scanner;
import java.lang.Math;
public class IncomeCalcultor
{
	public static void main(String[] args) 
	{
		final int TAX_RATE = 35;
		final int AVERAGE_INCOME = 500;
		final int HIGH_INCOME = 750;
		final int LOW_INCOME = 250;
		final int NO_INCOME = 0;
		System.out.print("How much are you paid a month before tax? ");
		Scanner input = new Scanner(System.in);
		Double income = input.nextDouble();
		
		
		System.out.print("How much do you pay in rent/mortgage a month? ");
		double accommodation = input.nextDouble();
		
		
		System.out.print("How much does your commute cost a month? ");
		double transport = input.nextDouble();
		
		
		System.out.print("How much do you pay for food per month? ");
		double food = input.nextDouble();
		
		
		double tax = (income / 100) * TAX_RATE;
		double totalDeduction = tax + accommodation + transport + food;
		double netIncome = income - totalDeduction;
		double percentageRemaining = (netIncome / income) * 100;
		
		input.close();
	
		
		System.out.println("Your disposable income is €" + String.format("%.2f", netIncome) + " this is equal to " + 
		Math.round(percentageRemaining) + "% of your salary!");
		
		if (netIncome > AVERAGE_INCOME && netIncome < HIGH_INCOME && netIncome != AVERAGE_INCOME)
			System.out.print("Your Disposable income is more than the national average");
		
		else if (netIncome > LOW_INCOME && netIncome < AVERAGE_INCOME && netIncome != AVERAGE_INCOME)
			System.out.print("Your disposable income is less than the national average");
		
		else if (netIncome == AVERAGE_INCOME)
			System.out.print("Your disposable income is equal to the national average");
		
		else if(netIncome < LOW_INCOME && netIncome > NO_INCOME && netIncome != NO_INCOME)
			System.out.print("Your disposable income is much less than the national average");
		
		else if (netIncome <= NO_INCOME )
			System.out.print("You do not have any disposable income");
		
		else if (netIncome >= HIGH_INCOME)
			System.out.print("Your disposable income is much more than the national average");
		
	}

}
