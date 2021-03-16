import java.util.Scanner;
import java.text.NumberFormat;
public class Main
{
  public static void getDollarAmount (int quarters, int dimes, int nickels,
				      int pennies)
  {
    NumberFormat formatter = NumberFormat.getCurrencyInstance ();
    double total =
      (0.25d * quarters) + (0.1d * dimes) + (0.05d * nickels) +
      (0.01d * pennies);
      System.out.println ("Your total will be: " + formatter.format (total));
  }
  public static void main (String[]args)
  {
    Scanner input = new Scanner (System.in);
    System.out.println ("Please enter number of quarters: ");
    int quarters = input.nextInt ();
    System.out.println ("Please enter number of dimes: ");
     int dimes = input.nextInt ();
    System.out.println ("Please enter number of nickels: ");
    int nickels = input.nextInt ();
    System.out.println ("Please enter number of pennies: ");
    int pennies = input.nextInt ();
    getDollarAmount(quarters, dimes, nickels, pennies);
  }
}
