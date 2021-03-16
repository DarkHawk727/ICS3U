import java.util.Scanner;
public class Main
{

  public static void main (String[]args)
  {
    System.out.println ("Please enter a number: ");
    Scanner input = new Scanner (System.in);
    int num = 0;
      num = input.nextInt ();
    int huns = 0;
      huns = num / 100;
      System.out.println ("The hundreds digit is: " + huns);
    int tens = 0;
      tens = (num / 10) % 10;
      System.out.println ("The tens digit is: " + tens);
    int ones = 0;
      ones = (num % 10);
      System.out.println ("The ones place is: " + ones);
  }

}