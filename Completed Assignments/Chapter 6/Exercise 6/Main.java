import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    int sum = 0;
    Scanner input = new Scanner (System.in);
      System.out.println ("Please enter a natural number: ");
    String num = input.nextLine ();
    for (int i = 0; i < num.length (); i++)
      {
	char temp = num.charAt (i);
	if (Character.isDigit (temp))
	  {
	    int add = Integer.parseInt (String.valueOf (temp));
	      sum = sum + add;
	  }
      }
    System.out.println ("The sum of the digits is: " + sum);
  }
}
