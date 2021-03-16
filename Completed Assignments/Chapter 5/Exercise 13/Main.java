import java.util.Scanner;
import java.text.NumberFormat;
public class Main
{
  public static void main (String[]args)
  {
    Scanner input = new Scanner (System.in);
    NumberFormat formatter = NumberFormat.getCurrencyInstance ();
      System.out.println ("Please enter the principal amount: ");
    float principal = input.nextFloat ();
      System.out.println ("Please enter the interest rate: ");
    float interest = input.nextFloat ();
      System.out.println ("Please enter the number of monthly payments: ");
    int payments = input.nextInt ();
    float top = (principal * (interest / 12));
    double bottom = 1f - (Math.pow (1f + interest / 12f, payments * -1f));
    double monthly = top / bottom;
      System.out.println ("The monthly payment will be: " +
			  formatter.format (monthly));
  }
}
