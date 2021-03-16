import java.util.Scanner;
import java.util.Random;
public class Main
{
  public static void main (String[]args)
  {
    Random r = new Random ();
    Scanner input = new Scanner (System.in);
      System.out.println ("Please enter a number (1-20): ");
    int guess = input.nextInt ();
    int comp = r.nextInt (20);
    while (guess != comp)
      {
	System.out.println ("Please try again!");
	guess = input.nextInt ();
      }
    System.out.println ("You Won!");
  }
}
