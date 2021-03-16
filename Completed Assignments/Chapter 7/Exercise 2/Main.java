import java.util.Scanner;
public class Main
{
  public static float metricConversion (float length, int choice)
  {
    float answer = 0.0f;
    if (choice == 1)
      {
	answer = length * 2.54f;
      }
    if (choice == 2)
      {
	answer = length * 30.84f;
      }
    if (choice == 3)
      {
	answer = length / 1.094f;
      }
    if (choice == 4)
      {
	answer = length * 1.609f;
      }
    return answer;
  }
  public static void metricConversion2 (float length, int choice)
  {
    float answer = 0.0f;
    if (choice == 5)
      {
	answer = length / 2.54f;
	System.out.println (length + " centimeters equals " + answer +
			    " inches.");
      }
    if (choice == 6)
      {
	answer = length / 30.84f;
	System.out.println (length + " centimeters equals " + answer +
			    " feet.");
      }
    if (choice == 7)
      {
	answer = length / 1.094f;
	System.out.println (length + " meters equals " + answer + " yards.");
      }
    if (choice == 8)
      {
	answer = length / 1.609f;
	System.out.println (length + " inches equals " + answer + " feet.");
      }
  }
  public static void main (String[]args)
  {
    Scanner input = new Scanner (System.in);
    System.out.println ("Please enter a measurment: ");
    float length = input.nextFloat ();
    System.out.format ("%s %25s", "1. Inches to Feet", "5. Feet to Inches\n");
    System.out.format ("%s %25s", "2. Feet to Centimeters",
		       "6. Centimeters to Feet\n");
    System.out.format ("%s %25s", "3. Yards to Meters",
		       "7. Meters to Yards\n");
    System.out.format ("%s %25s", "4. Miles to Kilometers",
		       "8. Kilometers to Miles\n");
    System.out.println ("Please enter a choice: ");
    int choice = input.nextInt ();
    if (choice <= 4)
      {
	System.out.println ("The answer is: " +
			    metricConversion (length, choice));
      }
    else
      {
	metricConversion2 (length, choice);
      }

  }
}
