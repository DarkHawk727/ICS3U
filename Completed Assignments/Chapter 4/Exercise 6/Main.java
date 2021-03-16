import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner input = new Scanner (System.in);
      System.out.print("Please enter amount in cents: ");
    int cents;
    int quarters;
    int dimes;
    int nickels;
    int pennies;
      cents = input.nextInt();
      quarters = cents / 25;
      cents = cents % 25;
      dimes = cents / 10;
      cents = cents % 10;
      nickels = cents / 5;
      cents = cents % 5;
      pennies = cents / 1;
      System.out.println ("\nThe minimum number of coins is:");
      System.out.format ("%2s %2s %2s %2s %2s %2s %2s %2s", quarters,
             "quarters\n", dimes, "dimes\n ", nickels,
             "nickels\n", pennies, "pennies\n");
  }
}