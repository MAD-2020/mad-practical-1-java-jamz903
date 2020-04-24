import java.util.Scanner;
import java.util.ArrayList;
public class Question5
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    //System.out.print("Enter number: ");
    int no = in.nextInt();
    ArrayList<Integer> data = new ArrayList<>();
    
    for(int i=1; i<=no; i++){
      System.out.print("Enter Integer " + i + ":");
      data.add(in.nextInt());
    }
    
    int dataLength = 0;
    for (int element: data) {
      dataLength++;
    }
    
    int mode = data.get(0).intValue();
    int a = 0;
    int firstNo = data.get(0).intValue();
    for (int element : data){
      if(element == firstNo ){
        a++;
      }
    }
    
    for (int i=1; i< dataLength; i++){
      int count = 0;
      int secondNo = data.get(i).intValue();
      for (int element : data){
        if(element == secondNo ){
          count++;
        }
        
      }
      if(count > a){
        a = count;
        mode = data.get(i);
      }
    }
    System.out.println("Mode is " + mode);
  }
}
