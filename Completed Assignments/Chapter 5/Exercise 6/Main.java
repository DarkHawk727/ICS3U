import java.util.Scanner;
import java.util.Random;
public class Main
{
  public static void main (String[]args)
  {
    Scanner input = new Scanner (System.in);
    Random r = new Random ();
    int num1 = r.nextInt (10);
    int num2 = r.nextInt (10);
    int operator = r.nextInt (4);
    float ans = 0;
    float guess = 0;
    if (operator == 1)
      {
	ans = num1 * num2;
	System.out.println ("What is " + num1 + " x " + num2 + "?");
	guess = input.nextFloat ();
      }
    if (operator == 2)
      {
	ans = num1 / num2;
	System.out.println ("What is " + num1 + " / " + num2 + "?");
	guess = input.nextFloat ();
      }
    if (operator == 3)
      {
	ans = num1 + num2;
	System.out.println ("What is " + num1 + " + " + num2 + "?");
	guess = input.nextFloat ();
      }
    if (operator == 4)
      {
	ans = num1 - num2;
	System.out.println ("What is " + num1 + " - " + num2 + "?");
	guess = input.nextFloat ();
      }
    if (guess == ans)
      {
	System.out.println ("Correct!");
      }
    else
      {
	System.out.println ("Incorrect!");
      }
  }
}
