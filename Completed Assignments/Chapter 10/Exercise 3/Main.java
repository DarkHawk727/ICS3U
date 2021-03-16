import java.util.Random;
import java.util.ArrayList;
public class Main
{
  public static void main (String[]args)
  {
    int array[] = new int[500];
    int zeros = 0;
    int ones = 0;
    int twos = 0;
    int threes = 0;
    int fours = 0;
    int fives = 0;
    int sixes = 0;
    int sevens = 0;
    int eights = 0;
    int nines = 0;
    for (int i = 0; i < array.length; i++)
      {
	array[i] = (int) (Math.random () * 10);
	if (array[i] == 0)
	  {
	    zeros++;
	  }
	if (array[i] == 1)
	  {
	    ones++;
	  }
	if (array[i] == 2)
	  {
	    twos++;
	  }
	if (array[i] == 3)
	  {
	    threes++;
	  }
	if (array[i] == 4)
	  {
	    fours++;
	  }
	if (array[i] == 5)
	  {
	    fives++;
	  }
	if (array[i] == 6)
	  {
	    sixes++;
	  }
	if (array[i] == 7)
	  {
	    sevens++;
	  }
	if (array[i] == 8)
	  {
	    eights++;
	  }
	if (array[i] == 9)
	  {
	    nines++;
	  }
      }
      System.out.format ("%s %5s", "Number:", "Instances:");
    System.out.println ("");
    System.out.format ("%s %5s", "0", zeros);
    System.out.println ("");
    System.out.format ("%s %5s", "1", ones);
    System.out.println ("");
    System.out.format ("%s %5s", "2", twos);
    System.out.println ("");
    System.out.format ("%s %5s", "3", threes);
    System.out.println ("");
    System.out.format ("%s %5s", "4", fours);
    System.out.println ("");
    System.out.format ("%s %5s", "5", fives);
    System.out.println ("");
    System.out.format ("%s %5s", "6", sixes);
    System.out.println ("");
    System.out.format ("%s %5s", "7", sevens);
    System.out.println ("");
    System.out.format ("%s %5s", "8", eights);
    System.out.println ("");
    System.out.format ("%s %5s", "9", nines);
    System.out.println ("");
  }
}
