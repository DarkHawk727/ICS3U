import java.util.Scanner;
import java.text.NumberFormat;
public class Main
{
  public static void main (String[]args)
  {
    Scanner input = new Scanner (System.in);
    NumberFormat formatter = NumberFormat.getCurrencyInstance ();
      System.out.println ("Please enter the number of eggs: ");
    int eggs = input.nextInt ();
    double price = 0;
    if (eggs >= 0 && eggs < 48)
      {
	price = (0.5 * eggs) / 12;
	System.out.println ("The total price is: " +
			    formatter.format (price));
      }
    if (eggs >= 48 && eggs < 60)
      {
	price = (0.45 * eggs) / 12;
	System.out.println ("The total price is: " +
			    formatter.format (price));
      }
    if (eggs >= 60 && eggs < 132)
      {
	price = (0.4 * eggs) / 12;
	System.out.println ("The total price is: " +
			    formatter.format (price));
      }
    if (eggs >= 132)
      {
	price = (0.35 * eggs) / 12;
	System.out.println ("The total price is: " +
			    formatter.format (price));
      }
  }
}
