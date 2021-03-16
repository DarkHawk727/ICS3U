import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner input = new Scanner (System.in);
      System.out.println ("Please enter a number: ");
    int num = input.nextInt ();
    int i = 2;
    while (i <= num)
      {
	if (num % i == 0)
	  {
	    System.out.println (i);
	    num = num / i;
	  }
	else
	  {
	    i++;
	  }
      }
  }
}
