import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner input = new Scanner (System.in);
      System.out.println ("Please enter package weight (kg): ");
    int weight = input.nextInt ();
      System.out.println ("Please enter package height (cm): ");
    int height = input.nextInt ();
      System.out.println ("Please enter package length (cm): ");
    int length = input.nextInt ();
      System.out.println ("Please enter package width (cm): ");
    int width = input.nextInt ();
    int volume = length * width * height;
    if(weight > 27){
        System.out.println("Too heavy!");
    }
    if(volume > 100000){
        System.out.println("Too large!");
    }
  }
}
