/* SELF ASSESSMENT 
   1.  createSequence:
Did I use the correct method definition?
Mark out of 5: 5
Comment: The method takes N and returns an initialised Array
Did I create an array of size n (passed as the parameter) and initialise it?
Mark out of 5:3
Comment:I used an Array of size N+1 to avoid confusion when parsing throought the array
Did I return the correct item?
Mark out of 5:5
Comment:the initialised Array was returned
   2.  crossOutMultiples
Did I use the correct method definition?
Mark out of 5:5
Comment: The method takes both inputs and produces the appropriate output
Did I ensure the parameters are not null and one of them is a valid index into the array
Mark out of 2: 2
Comment: No parameters in the array are null
Did I loop through the array using the correct multiple?
Mark out of 5: 5 
Comment: I started witha  multiple of 2 and worked up until the product resulted in a number bigger than N
Did I cross out correct items in the array that were not already crossed out?
Mark out of 3: 3
Comment: All items were only crossed out once
   3.  sieve   
Did I have the correct function definition?
Mark out of 5:5 	
Comment: The function matches the specification
Did I make calls to other methods?
Mark out of 5:5
Comment: all methods were called within other methods       
Did I return an array with all non-prime numbers are crossed out?
Mark out of 2:2
Comment: The array returned was correct
   4.  sequenceTostring  
Did I have the correct function definition?
Mark out of 5: 5
Comment: My function follows the given definition
Did I ensure the parameter to be used is not null?
Mark out of 3: 3
Comment: In my main function the program will not run unless a number is entered so no parameters are null
Did I Loop through the array updating the String variable with the non-crossed out numbers and the crossed numbers in brackets? 
Mark out of 10: 10 
Comment: The string variable correctly updated using a for loop with crossed out and non crossed out numbers    
   5.  nonCrossedOutSubseqToString  
Did I have the correct function definition
Mark out of 5: 5
Comment: My function follows the function specification from the program documentation     
Did I ensure the parameter to be used is not null?  
Mark out of 3: 3	
Comment: this is ensured in my main function
Did I loop through the array updating the String variable with just the non-crossed out numbers? 
Mark out of 5: 5
Comment: the string variables output is correct
   6.  main  
Did I ask  the user for input n and handles input errors?  
Mark out of 5: 5
Comments: the main takes input and ensures that the input is an integer
Did I make calls to other methods (at least one)?
Mark out of 5: 5 
Comment:  My main function calls sieve() and nonCrossedOutSubSeqToString()
Did I print the output as shown in the question?  
Mark out of 5: 4
Comment:  My output matches what is shown in the project specification
   7.  Overall
Is my code indented correctly?
Mark out of 4: 4
Comments: to the best of my knowledge this is true
Do my variable names make sense?
Mark out of 4: 4 
Comments:I feel my variable names are appropriate and make sense
Do my variable names, method names and class name follow the Java coding standard
Mark out of 4: 4
Comments: variable method and class names all follow the coding standard
      Total Mark out of 100 (Add all the previous marks): 94
      
*/

import java.util.Scanner;

public class sieveOfEratosthenes {
	public static void main(String[] args) {
		System.out.print("Please enter a positive whole number greater than two and press enter: ");
		Scanner input = new Scanner(System.in);
			if (input.hasNextInt() == true) {
			int N = input.nextInt();
			input.close();
			System.out.println(sieve(N));
			System.out.println(nonCrossedOutSubSeqToString(N));
			
	    }else {
	    	System.out.print("Please make a valid selection");
	    }
	}
	public static int[] createSequence(int N){
		int orderedNumbers[] = new int[N+1];
		int counter = 0;
		while (counter <= N){
			orderedNumbers[counter] = counter;
			
			counter++;
		}
		return crossOutHigherNumbers(orderedNumbers, N);
	}
	public static int[] crossOutHigherNumbers(int[] orderedNumbers, int N) {
	
		int[]crossedOutNumbers = new int[N+1];
		for (int i=0; i<=N;i++) {
			crossedOutNumbers[i] = orderedNumbers[i];
		}
		for(int currentNumber = 2; currentNumber<=N;currentNumber++) {
			if (orderedNumbers[currentNumber] == crossedOutNumbers[currentNumber]) {
				for (int multiple=2; currentNumber*multiple <= N; multiple++ ) {
					if(orderedNumbers[currentNumber*multiple] >1) {
					orderedNumbers[currentNumber*multiple] = (orderedNumbers[currentNumber*multiple]*-1);
					crossedOutNumbers[currentNumber*multiple] = (orderedNumbers[currentNumber*multiple]*-1);
					
				}
			}
				
				
		}
	} 
		return orderedNumbers;
}
	public static String sieve(int N) {
		int[] sortedNumbers = new int[N+1];
		sortedNumbers = createSequence(N);
		return sequenceToString(sortedNumbers, N);
	}
	private static String sequenceToString(int[] sortedNumbers, int N) {
		String finalNumbers = "";
		
		for (int count = 2;count<=N; count++) {
			if(sortedNumbers[count] <0) {
				finalNumbers = finalNumbers + "[" + count + "], ";
		}
			else {
				finalNumbers = finalNumbers + count + ", ";
			}	
	}
		return finalNumbers;
	}
	
	private static String nonCrossedOutSubSeqToString (int N) {
		String primeNumbers = "";
		int[] sortedNumbers = new int[N+1];
		sortedNumbers = createSequence(N);
		for (int count = 2; count<=N; count++) {
			if (sortedNumbers[count] >0) {
				primeNumbers = primeNumbers + count + ", ";
			}
		}
		return primeNumbers;
	}
}


