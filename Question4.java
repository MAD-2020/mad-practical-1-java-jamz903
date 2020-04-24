import java.util.Scanner;

public class Question4
{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    //System.out.print("Enter an integer: ");
    int n = in.nextInt();
    count(n);
    
  }

  public static void count(int n) {

  for(int i = n; i >= 0; i-=1){
    String star = "*";
    System.out.println(star.repeat(i));
    }
  }
}
