import java.util.ArrayList;
import java.util.Random;
public class Main
{
  public static void main (String[]args)
  {

    int numbers[] = new int[25];
    for (int i = 0; i < numbers.length; i++)
      {
	numbers[i] = (int) (Math.random () * 99);
      }
    System.out.println ("The Even numbers are: ");
    for (int i = 0; i < numbers.length; i++)
      {
	if (numbers[i] % 2 == 0)
	  {
	    System.out.print (numbers[i] + ", ");
	  }
      }
    System.out.println ("");
    System.out.println ("The Odd numbers are: ");
    for (int i = 0; i < numbers.length; i++)
      {
	if (numbers[i] % 2 != 0)
	  {
	    System.out.print (numbers[i] + ", ");
	  }
      }
  }
}
