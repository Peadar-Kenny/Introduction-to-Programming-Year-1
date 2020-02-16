/* SELF ASSESSMENT
 1. Did I use easy-to-understand meaningful, properly formatted, variable names and CONSTANTS?
        Mark out of 10: 10
        Comment: All variable names and constants are easy to understand
 2. Did I implement the getVerse function correctly and in a manner that can be understood (5 marks for function definition, 5 marks for function call and 15 marks for function implementation)?
       Mark out of 25: 25
        Comment: The getVerse function returns the verses to be read correctly in the proper order  
 3. Did I implement the getChristmasGift function correctly using a switch statement and in a manner that can be understood (5 marks for function definition, 5 marks for function call and 15 marks for function implementation)?
       Mark out of 25: 25
        Comment: the getChristmasGift function correctly uses a switch statement and in a manner that can be understood 
 4. Did I implement the getOrdinalString function correctly using if or conditional operators and in a manner that can be understood (5 marks for function definition, 5 marks for function call and 15 marks for function implementation)?
       Mark out of 25: 25
        Comment: getOrdinalString uses the if operator and can be understood quite easily I feel
 5. Does the program produce the output correctly?
       Mark out of 10:10
        Comment: the output is outputted correctly 
 6. How well did I complete this self-assessment?
        Mark out of 5:5
        Comment: I don't feel I have made ant mistakes in my self assessment 
 Total Mark out of 100 (Add all the previous marks): 100
*/ 
public class Twelve_days_of_christmas {

	final static int MAX_VERSES = 12;
	final static String VERSE_INTRO = "\nMy true love gave to me: ";
	final static String FIRST_VERSE_INITIAL = "\nA partridge in a pear tree. ";
	final static String FIRST_VERSE = "\nAnd a partridge in a pear tree. ";
	final static String SECOND_VERSE = "\nTwo turtle doves, ";
	final static String THIRD_VERSE = "\nThree French hens, ";
	final static String FOURTH_VERSE = "\nFour calling birds, ";
	final static String FIFTH_VERSE = "\nFive gold rings, ";
	final static String SIXTH_VERSE = "\nSix geese a-laying, ";
	final static String SEVENTH_VERSE = "\nSeven swans a-swimming, ";
	final static String EIGHTH_VERSE = "\nEight maids a-milking, ";
	final static String NINTH_VERSE = "\nNine ladies dancing, ";
	final static String TENTH_VERSE = "\nTen lords a-leaping, ";
	final static String ELEVENTH_VERSE = "\nEleven pipers piping, ";
	final static String TWELFTH_VERSE = "\nTwelve drummers drumming, ";
	public static void main(String[] args) {
		
		for (int versesRead = 1; versesRead <= MAX_VERSES; versesRead++) {
			System.out.print("\n" + versesRead + ":" + getChristmasGift(versesRead) + "\n");
			System.out.print(getVerse(versesRead));
			}
			
		}
		
		

	
	public static String getVerse (int versesRead) {
		String verse = "";
		switch (versesRead) {
		case 1: 
			verse =("On the" + getOrdinalString(versesRead) + "day of Christmas " + VERSE_INTRO + FIRST_VERSE_INITIAL);
			break;
		case 2:
			verse =("On the" + getOrdinalString(versesRead) + "day of Christmas " + VERSE_INTRO + SECOND_VERSE + FIRST_VERSE);
			break;
		case 3:
			verse =("On the" + getOrdinalString(versesRead) + "day of Christmas " + VERSE_INTRO + THIRD_VERSE + SECOND_VERSE + FIRST_VERSE);
			break;
		case 4:
			verse =("On the" + getOrdinalString(versesRead) + "day of Christmas " + VERSE_INTRO + FOURTH_VERSE + THIRD_VERSE + SECOND_VERSE + FIRST_VERSE);
			break;
		case 5:
			verse =("On the" + getOrdinalString(versesRead) + "day of Christmas " + VERSE_INTRO + FIFTH_VERSE + FOURTH_VERSE + THIRD_VERSE + SECOND_VERSE + FIRST_VERSE);
			break;
		case 6:
			verse =("On the" + getOrdinalString(versesRead) + "day of Christmas " + VERSE_INTRO + SIXTH_VERSE + FIFTH_VERSE + FOURTH_VERSE + THIRD_VERSE + SECOND_VERSE + FIRST_VERSE);
			break;
		case 7:
			verse =("On the" + getOrdinalString(versesRead) + "day of Christmas " + VERSE_INTRO + SEVENTH_VERSE + SIXTH_VERSE + FIFTH_VERSE + FOURTH_VERSE + THIRD_VERSE + SECOND_VERSE + FIRST_VERSE);
			break;
		case 8:
			verse =("On the" + getOrdinalString(versesRead) + "day of Christmas " + VERSE_INTRO + EIGHTH_VERSE + SEVENTH_VERSE + SIXTH_VERSE + FIFTH_VERSE + FOURTH_VERSE + THIRD_VERSE + SECOND_VERSE + FIRST_VERSE);
			break;
		case 9:
			verse =("On the" + getOrdinalString(versesRead) + "day of Christmas " + VERSE_INTRO + NINTH_VERSE + EIGHTH_VERSE + SEVENTH_VERSE + SIXTH_VERSE + FIFTH_VERSE + FOURTH_VERSE + THIRD_VERSE + SECOND_VERSE + FIRST_VERSE);
			break;
		case 10:
			verse =("On the" + getOrdinalString(versesRead) + "day of Christmas " + VERSE_INTRO + TENTH_VERSE + NINTH_VERSE + EIGHTH_VERSE + SEVENTH_VERSE + SIXTH_VERSE + FIFTH_VERSE + FOURTH_VERSE + THIRD_VERSE + SECOND_VERSE + FIRST_VERSE);
			break;
		case 11:
			verse = ("On the" + getOrdinalString(versesRead) + "day of Christmas " + VERSE_INTRO + ELEVENTH_VERSE + TENTH_VERSE + NINTH_VERSE + EIGHTH_VERSE + SEVENTH_VERSE + SIXTH_VERSE + FIFTH_VERSE + FOURTH_VERSE + THIRD_VERSE + SECOND_VERSE + FIRST_VERSE);
			break;
		default:
			verse = ("On the" + getOrdinalString(versesRead) + "day of Christmas " + VERSE_INTRO + TWELFTH_VERSE + ELEVENTH_VERSE + TENTH_VERSE + NINTH_VERSE + EIGHTH_VERSE + SEVENTH_VERSE + SIXTH_VERSE + FIFTH_VERSE + FOURTH_VERSE + THIRD_VERSE + SECOND_VERSE + FIRST_VERSE);
			break;
		}
		return verse;
	}
	public static String getChristmasGift (int versesRead) {
		switch (versesRead) {
		case 1:
			return FIRST_VERSE_INITIAL;
			
		case 2:
			return SECOND_VERSE;
			
		case 3:
			return THIRD_VERSE;
			
		case 4:
			return FOURTH_VERSE;
			
		case 5:
			return FIFTH_VERSE;
			
		case 6:
			return SIXTH_VERSE;
			
		case 7:
			return SEVENTH_VERSE;
			
		case 8:
			return EIGHTH_VERSE;
			
		case 9:
			return NINTH_VERSE;
			
		case 10:
			return TENTH_VERSE;
			
		case 11:
			return ELEVENTH_VERSE;
			
		default:
			return TWELFTH_VERSE;
			
		}
		
	}
	public static String getOrdinalString (int versesRead) {
		if (versesRead == 1) {
			return " first ";
		}else if(versesRead == 2){
			return " second ";
		}else if(versesRead == 3) {
			return " third ";
		}else if(versesRead == 4) {
			return " fourth ";
		}else if (versesRead == 5) {
			return " fifth ";
		}else if (versesRead == 6) {
			return " sixth ";
		}else if (versesRead == 7) {
			return " seventh ";
		}else if (versesRead == 8) {
			return " eighth ";
		}else if (versesRead == 9) {
			return " ninth ";
		}else if (versesRead == 10) {
			return " tenth ";
		}else if (versesRead == 11) {
			return " eleventh ";
		}else {
			return " twelfth ";
		}
	}
}
