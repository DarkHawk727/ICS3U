import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner input = new Scanner (System.in);
      System.out.println ("Plese enter an integer: ");
    int num1 = input.nextInt ();
      System.out.println ("Please enter a second integer: ");
    int num2 = input.nextInt ();
    int ans1 = num1 / num2;
      System.out.print (num1);
      System.out.print (" / " + num2);
      System.out.print (" = " + ans1);
    int ans2 = num2 / num1;
      System.out.println (num2);
      System.out.print (" / " + num1);
      System.out.print (" = " + ans2);
    int ans3 = num1 % num2;
      System.out.print (num1);
      System.out.print (" % " + num2);
      System.out.print (" = " + ans1);
    int ans4 = num2 % num1;
      System.out.println (num2);
      System.out.print (" % " + num1);
      System.out.print (" = " + ans2);


  }
}
