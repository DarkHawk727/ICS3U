import java.util.Scanner;
import java.text.NumberFormat;
public class Main
{
  public static void main (String[]args)
  {
    System.out.println ("Welcome to Local Shop!");
    System.out.println ("Please enter the diameter of your pizza: ");
    Scanner input = new Scanner (System.in);;
    float diameter = input.nextFloat ();
    float cost = 0.05f * (float) Math.pow (diameter, 2) + 1.75f;
    NumberFormat currency = NumberFormat.getCurrencyInstance ();
    String answer = currency.format (cost);
      System.out.println ("The cost of your pizza will be: " + answer);
  }
}
