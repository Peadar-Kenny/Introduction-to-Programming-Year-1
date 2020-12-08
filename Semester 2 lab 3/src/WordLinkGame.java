/*1. readDictionary
        - I have the correct method definition [Mark out of 5:] 5
        - Comment: The method definition is correct
        - My method reads the words from the "words.txt" file. [Mark out of 5:] 5
        - Comment: the method reads the words from words.txt
        - It returns the contents from "words.txt" in a String array or an ArrayList. [Mark out of 5:]5
        - Comment: it does this

        2. readWordList
        - I have the correct method definition [Mark out of 5:]5
        - Comment:the method definition is correct
        - My method reads the words provided (which are separated by commas, saves them to an array or ArrayList of String references and returns it. [Mark out of 5:]5
        - Comment: My program does this

        3. isUniqueList
        - I have the correct method definition [Mark out of 5:]5
        - Comment: this is correct
        - My method compares each word in the array with the rest of the words in the list. [Mark out of 5:]5
        - Comment: this is done through 2 for loops
        - Exits the loop when a non-unique word is found. [Mark out of 5:] 5
        - Comment: the program will return false if it finds to similar words
        - Returns true is all the words are unique and false otherwise. [Mark out of 5:] 5
        - Comment: the program works like this

        4. isEnglishWord
        - I have the correct method definition [Mark out of 5:] 5
        - Comment:it is correct
        - My method uses the binarySearch method in Arrays library class. [Mark out of 3:]3
        - Comment: it uses binarySearch
        - Returns true if the binarySearch method return a value >= 0, otherwise false is returned. [Mark out of 2:]2
        - Comment: the method works in this way

        5. isDifferentByOne
        - I have the correct method definition [Mark out of 5:]5
        - Comment: the method definition is correct
        - My method loops through the length of a words comparing characters at the same position in both words searching for one difference. [Mark out of 10:]5
        - Comment: while in theory my code should do this it does not and i am unable to figure out why

        6. isWordChain
        - I have the correct method definition [Mark out of 5:]5
        - Comment: the definition matches the project outline
        - My method calls isUniqueList, isEnglishWord and isDifferentByOne methods and prints the appropriate message [Mark out of 10:] 5
        - Comment: the method calls all the other methods but does not print the right message

        7. main
        - Reads all the words from file words.txt into an array or an ArrayList using the any of teh Java.IO classes covered in lectures [Mark out of 10:]0
        - Comment: I did this in readDictionary
        - Asks the user for input and calls isWordChain [Mark out of 5:]5
        - Comment:the program does this

        Total Mark out of 100 (Add all the previous marks): 80
        */
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.Arrays;


public class WordLinkGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean finished = false;
        while ( finished != true){
            System.out.print("\nPlease enter a list of words seperated by commas ");
            String answer = input.next();

            if(answer == null){
            finished = true;
            }
            String []wordList = readWordList(answer);
            if(isWordChain(wordList)==true){
                System.out.print("\nValid chain of words from Lewis Carroll's word-links game.");
            }else {
                System.out.print("\nNot a valid chain of words from Lewis Carroll's word-links game.");
            }


        }
    }

    public static String[] readDictionary()

    {
        String[] dictionary = new String[658964];
        int count = 0;
        try {
            FileInputStream fin = new FileInputStream("words.txt");
            int i = 0;
            String currentWord = "";
            while((i =fin.read())!=-1){
                if((char)i=='\n'){
                    dictionary[count] =currentWord;
                    count++;
                    currentWord="";
                } else currentWord +=(char)i;
            }
            fin.close();
            System.out.print("Load complete!");


        } catch (Exception e) {
            System.out.print(e);
        }
        return dictionary;
    }
    public static String[] readWordList (String answer){

        String[] wordList =answer.split(",");
        return wordList;

    }

    public static Boolean isUniqueList(String[] userInput){
        for(int i = 0; i< userInput.length; i++){
            for(int j=0; j<userInput.length;j++){
                if(userInput[i]== userInput[j] && i!=j){
                    return false;
                }
            }
        }
        return true;
    }

    public static Boolean isEnglishWord(String answer){
        boolean isEnglishWord = true;
        if(Arrays.binarySearch(readDictionary(), answer) ==-1){
            isEnglishWord = false;
        }
        return isEnglishWord;
    }
    public static Boolean isDifferentByOne (String answer, String comparison){
        int count = 0;
        if(answer.length() == comparison.length()){
            for(int i = 0; i<=answer.length(); i++){
                if(answer.charAt(i)!=comparison.charAt(i)){
                    count++;
                }
            }
        }else{
            return false;
        }
        if(count > 1) return false;
        return true;
    }

    public static boolean isWordChain(String[] answer){
        for(int i = 0; i<answer.length-1; i++){
            if(isEnglishWord(answer[i])==false)return false;
            if(isDifferentByOne(answer[i], answer[i+1])==false) return false;
            if(isUniqueList(answer)==false) return false;
        }
        return true;
    }

}