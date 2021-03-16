import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner input = new Scanner (System.in);
      System.out.println ("Please enter a number: ");
    int num = input.nextInt ();
    if (num == 2 || num == 3)
      {
	System.out.println (num + " is prime.");
      }
    else if (num % 2 == 0 || num % 3 == 0)
      {
	System.out.println (num + " is NOT prime.");
      }

    else
      {
	System.out.println (num + " is prime");
      }
  }
}

// Maybe somehow make it into a for loop. 
