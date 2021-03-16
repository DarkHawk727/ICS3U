import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner input = new Scanner (System.in);
      System.out.println ("Please enter a natural number:");
    String num = input.nextLine ();
    for (int i = 0; i < num.length (); i++)
      {
	System.out.println (num.charAt (i));
      }
  }
}
