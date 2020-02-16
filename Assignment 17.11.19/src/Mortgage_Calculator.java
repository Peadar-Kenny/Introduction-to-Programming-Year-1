/* SELF ASSESSMENT

 1. Did I use easy-to-understand meaningfu,l properly formatted, variable names and CONSTANTS?
        Mark out of 10: 10
        Comment:   All names are easy to understand
 2. Did I indent the code appropriately?
        Mark out of 5: 5
        Comment:  all coded is indented 
 3. Did I implement the mainline correctly with a loop which continues using the user says "no" ?
       Mark out of 10: 10
        Comment:  the loops run correctly
 4. Did I obtain the relevant inputs from the user and produce the relevant outputs using the specified prompts & formats ?
       Mark out of 10: 10
        Comment:  all inputs and outputs are correct
 5. Did I implement the readDoubleFromUser function correctly and in a manner that can be easily understood (4 marks for function definition, 4 marks for function call and 12 marks for function implementation)?
       Mark out of 20: 20
        Comment:  works perfectly and is easily understood
 6. Did I implement the calculateMonthlyRepayment function correctly in a manner that can be easily understood (4 marks for function definition, 4 marks for function call and 12 marks for function implementation)?
       Mark out of 20: 20
        Comment:  works perfectly and is easily understood
 7. Did I implement the calculateMonthsToRepayMortgage function correctly in a manner that can be easilyunderstood (4 marks for function definition, 4 marks for function call and 12 marks for function implementation)?
       Mark out of 20: 20
        Comment:  works perfectly and is easily understood
 8. How well did I complete this self-assessment?
        Mark out of 5: 5
        Comment: Completed perfectly to my knowledge
 Total Mark out of 100 (Add all the previous marks): 100
*/ 
import java.util.Scanner;
public class Mortgage_Calculator {
final static String INCORRECT_INPUT = "Invalid input, please make a valid selection ";
final static double MORTGAGE_TERM = 20;
final static double PERCENTAGE_CONVERTER = 100;
final static double MONTHS_IN_A_YEAR = 12;

	public static void main(String[] args) {
		readDoubleFromUser();
		boolean finished = false;
		while (finished!=true) {
			System.out.print("\nWould you like to use the calculator again? ");
			Scanner input = new Scanner (System.in);
			if (input.hasNext("yes")){
				readDoubleFromUser();
			}
			else if (input.hasNext("no")) {
				finished = true;
			}
			else {
				System.out.print("\nPlease make a valid selection ");
			}
		}
	}
	public static void readDoubleFromUser() {
		Scanner input = new Scanner(System.in);
		double  mortgageAmount = 0;
		double annualPercentageRate = 0;
		System.out.print("Please enter the mortgage amount: ");
		if (input.hasNextDouble()) {
			mortgageAmount = input.nextDouble();
		}else {
			System.out.print(INCORRECT_INPUT);
			readDoubleFromUser();
		}
		System.out.print("Please enter the Annual Percentage Rate: ");
		if (input.hasNextDouble()) {
			annualPercentageRate = input.nextDouble();
		}else {
			System.out.print(INCORRECT_INPUT);
			readDoubleFromUser();
		}
		System.out.print("Assuming a 20 year term, the monthly repayments would be " + 
				Math.round(calculateMortgageRepayment(mortgageAmount, annualPercentageRate, MORTGAGE_TERM )));
		
		calculateMonthsToRepayMortgage(mortgageAmount, annualPercentageRate);
	}
	public static double calculateMortgageRepayment(double mortgageAmount, double annualPercentageRate, double MORTGAGE_TERM) {
		double topOfEqn = (mortgageAmount * (((annualPercentageRate/MONTHS_IN_A_YEAR)/PERCENTAGE_CONVERTER))); 
		double bottomOfEqn = (1-Math.pow(((1+((annualPercentageRate/MONTHS_IN_A_YEAR)/PERCENTAGE_CONVERTER))),(-1*MORTGAGE_TERM * MONTHS_IN_A_YEAR)));
		double amount = topOfEqn/bottomOfEqn;
		return amount;
	}
	public static void calculateMonthsToRepayMortgage(double mortgageAmount, double annualPercentageRate) {
		System.out.print("\nHow much can you afford to pay per month? ");
		boolean finished = false;
		int monthCharged = 0;
		int yearCharged = 0;
		Scanner input = new Scanner(System.in);
		double monthlyPayment = input.nextDouble();
		System.out.print("Mortgage amount: " + mortgageAmount + "\nAPR: " + annualPercentageRate + "\nMonthly Payment: " + monthlyPayment);
		while (finished != true) {
			mortgageAmount = mortgageAmount + (mortgageAmount * ((annualPercentageRate/PERCENTAGE_CONVERTER)/MONTHS_IN_A_YEAR));
			mortgageAmount = mortgageAmount - monthlyPayment;
			monthCharged++;
			if (monthCharged == 12) {
				yearCharged++;
				monthCharged = 0;
			}
			if (mortgageAmount <= 0) {
				finished = true;
			}
			
			
		}
		System.out.print("\nIf you pay " + monthlyPayment + " your mortgage would be paid off in " + yearCharged +
				" years and " + monthCharged + " months");
	}

		
	}
	


