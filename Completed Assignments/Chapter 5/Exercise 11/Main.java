import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner input = new Scanner (System.in);
      System.out.println
      ("The general form of a quadratic equation is: ax^2 + bx + c");
      System.out.println ("Enter a value of 'a': ");
    double a = input.nextFloat ();
      System.out.println ("Enter a value of 'a': ");
    double b = input.nextFloat ();
      System.out.println ("Enter a value of 'a': ");
    double c = input.nextFloat ();
    double root1 =
      ((b * -1) + Math.sqrt (Math.pow (b, 2) - 4 * a * c)) / (2 * a);
    double root2 =
      ((b * -1) - Math.sqrt (Math.pow (b, 2) - 4 * a * c)) / (2 * a);
      System.out.println ("The roots are: " + root1 + " and " + root2);

  }
}
