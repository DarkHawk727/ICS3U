import java.util.Scanner;
import java.lang.Math;
public class Main
{
  public static void main (String[]args)
  {
    Scanner input = new Scanner (System.in);
      System.out.println ("Please enter an angle (deg): ");
    double angle = input.nextDouble ();
    double sine = Math.sin (Math.toRadians (angle));
    double cosine = Math.cos (Math.toRadians (angle));
    double tangent = Math.tan (Math.toRadians (angle));
      System.out.println ("The sine of that angle is: " + sine);
      System.out.println ("The cosine of that angle is: " + cosine);
      System.out.println ("The tangent of that angle is: " + tangent);
  }
}
