import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.print("What is your height in Metres?  ");
    Scanner input = new Scanner(System.in);
    double height = input.nextDouble();
    System.out.println("Thank you, you have entered your height as " + height + "m");
     //Takes the users Height and stores it as a double
    System.out.print("What is your Weight? ");
    Scanner newinput = new Scanner (System.in);
    double weight = newinput.nextDouble();
    System.out.println("You have entered your height as " + height + "and your weight as " + weight + "Calculating your BMI now ");
    double heightsq = height * height;
    double BMI = weight / heightsq;
    System.out.println("Your BMI is equal to " + BMI);

    
    
  }
}
