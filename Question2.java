import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    Scanner in = new Scanner(System.in);
    //System.out.println("What is your height? ");
    double height = in.nextDouble();
    //System.out.println("What is your weight? ");
    double weight = in.nextDouble();
    double heightInM = height/100;
    double bmi = weight/(heightInM*heightInM);
    System.out.println("Your bmi is " + bmi);
  }
}
