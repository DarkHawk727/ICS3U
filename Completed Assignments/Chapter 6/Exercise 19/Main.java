import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner input = new Scanner (System.in);
      System.out.println ("Please enter a sentence: ");
    String str = input.nextLine ();
      System.out.println ("Please enter a string you would like to remove: ");
    String toRemove = input.nextLine ();
    String newString = str.replace (toRemove, "");
      System.out.println (newString);
  }
}
