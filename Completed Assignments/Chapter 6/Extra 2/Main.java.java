import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    String stars = "";
    Scanner input = new Scanner (System.in);
      System.out.println ("Please enter your name: ");
    String name = input.nextLine ();
      name = name.toUpperCase ();
    for (int i = 0; i < name.length (); i++)
      {
	String letter = name.substring (i, i + 1);
	  System.out.print (letter);
      }
    System.out.println ("");
    for (int i = 2; i < name.length (); i++)
      {
	stars += "*";
      }
    for (int i = 1; i < name.length () - 1; i++)
      {
	System.out.println (name.charAt (i) + stars + name.charAt ((name.length() - 1) - i));
      }

    for (int i = name.length () - 1; i >= 0; i--)
      {
	String letter = name.substring (i, i + 1);
	System.out.print (letter);
      }
  }
}
