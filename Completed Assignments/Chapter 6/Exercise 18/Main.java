import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner input = new Scanner (System.in);
      System.out.println ("Please enter your first name: ");
    String first = input.nextLine ();

      System.out.println ("Please enter your middle initial: ");
    String middle = input.nextLine ();
      System.out.println ("Please enter your last name: ");
    String last = input.nextLine ();
    char last1 = first.charAt (0);
    String firstInitial = first.toLowerCase ();
    String middleInitial = middle.toLowerCase ();
    String lastInitial = last.toUpperCase ();
      System.out.println ("Your monogram will be: " +
			  firstInitial.charAt (0) + lastInitial.charAt (0) +
			  middleInitial);
  }
}
