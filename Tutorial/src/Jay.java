
public class Jay {
	package com.jayCowan;

	import javax.swing.*;
	import java.lang.reflect.Array;
	import java.util.Arrays;
	import java.util.Scanner;

	public class Main {

	    public static void main(String[] args) {
	        double[] marks = new double[0];
	        int numberOfStudents = 0;
		    boolean keepGoing = true;
		    do {
		        String input = JOptionPane.showInputDialog("Please enter the mark or type 'quit' to quit");
	            Scanner scanner = new Scanner(input);
	            if (scanner.hasNextDouble()){
	                marks = Arrays.copyOf(marks, marks.length+1);
	                double mark = scanner.nextDouble();
	                marks[numberOfStudents] = mark;
	                numberOfStudents++;
	            } else if (scanner.hasNext("quit")){
	                keepGoing = false;
	            }
	        } while (keepGoing);
	        System.out.println("Highest mark is "+ determineBestMark(marks));
	        System.out.println("Number of First Class Honors is "+countFirstClassHonors(marks));
	    }
	    public static double determineBestMark(double[] marks){
	        double highestMark = marks[0];
	        for (double mark : marks) {
	            if (mark > highestMark) {
	                highestMark = mark;
	            }
	        }
	        return highestMark;
	    }
	    public static int countFirstClassHonors(double[] marks){
	        int firstClassCount = 0;
	        for (double mark : marks) {
	            if (mark >= 0.7) {
	                firstClassCount++;
	            }
	        }
	        return firstClassCount;
	    }
	    public static double[] copyArrayPlusOne(double[] array){
	        double[] newArray = new double[array.length+1];
	        newArray = array.clone();
	        return newArray;
	    }
	}
	public static void bubbleSort(int[] highScores) {
        for (int i = 0; i < highScores.length; i++) {
            for (int j = 0; j < highScores.length; j++) {
                if (highScores[i] > highScores[j]) {
                    int tempScore = highScores[i];
                    highScores[i] = highScores[j];
                    highScores[j] = tempScore;
                    //System.out.println("midrun " + Arrays.toString(highScores));
                }
            }
        }
        //System.out.println("last " + Arrays.toString(highScores));
    }
}
