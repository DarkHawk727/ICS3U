import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    System.out.print ("Please enter a time under 4.5 seconds: ");
    Scanner input = new Scanner (System.in);
    float time = input.nextFloat ();
    if (time <= 4.5)
      {

	float square = (float) Math.pow (time, 2);
	float answer = 100.0f - 4.9f * square;
	  System.out.println ("The height of the object is: " + answer);
      }
    else
      {
	System.out.println ("Please enter a lower number!");
      }
  }
}
