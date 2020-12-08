import java.util.Scanner;
public class C4HumanPlayer extends ConnectPlayer {
    C4HumanPlayer(String Symbol) {
        super(Symbol);
    }

    int  selectColumn(){
        Scanner input= new Scanner(System.in);
        boolean finished= false;
        int userInput = 0;
        while(!finished) {
            System.out.print("Player "+getSymbol() +": Please select a valid column to drop your piece (0-7)");
            if(input.hasNextInt()){
                userInput = input.nextInt();
                finished = true;
            }
        }
        return userInput;
    }
}
