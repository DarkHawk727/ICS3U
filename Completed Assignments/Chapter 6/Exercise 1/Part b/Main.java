import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner input = new Scanner (System.in);
      System.out.println ("Please enter the lower bound: ");
    int lower = input.nextInt ();
      System.out.println ("Please enter the upper bound: ");
    int higher = input.nextInt ();
    for (int i = lower; i <= higher; i++)
      {
	int count = 0;
	for (int n = 1; n <= i; n++)
	  {
	    if (i % n == 0)
	      {
		count = count + 1;
	      }
	    if (count == 2 && i == n)
	      System.out.println (i);
	  }
      }

  }
}
