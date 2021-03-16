import java.util.ArrayList;
import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner input = new Scanner (System.in);
      ArrayList < Integer > arraylist = new ArrayList < Integer > ();
      ArrayList < Integer > sortedArray = new ArrayList < Integer > ();
      System.out.println ("Please enter numbers from 1-50: ");
      System.out.println ("-1 is the end sequence and wil not be counted.");
    int num = input.nextInt ();
    while (num > -1)
      {
	System.out.println ("Enter a number -1 to exit");
	num = input.nextInt ();
	if (num > 0 && num <= 50)
	  {
	    arraylist.add (num);
	  }
      }
//Average =====================================
    int sum = 0;
    for (int i = 0; i < arraylist.size (); i++)
      {
	sum += arraylist.get (i);
      }
    double average = sum / arraylist.size ();
    System.out.println ("The Average is: " + average);
//Max =====================================
    int max = 0;
    int min = 0;
    max = arraylist.get (0);
    min = arraylist.get (0);
    for (int i = 0; i < arraylist.size (); i++)
      {
	if (arraylist.get (i) > max)
	  {
	    max = arraylist.get (i);
	  }
	if (arraylist.get (i) < min)
	  {
	    min = arraylist.get (i);
	  }
      }
    System.out.println ("The largest number is " + max);

//Range =================================================
    int range = max - min;
    System.out.println ("The Range is: " + range);
//Median ================================================
    int temp;
    for (int i = 0; i < arraylist.size (); i++)
      {
	for (int j = 0; j < arraylist.size () - 1; j++)
	  {
	    if (arraylist.get (j) > (arraylist.get (j + 1)))
	      {
		temp = arraylist.get (j);
		arraylist.set (j, arraylist.get (j + 1));
		arraylist.set (j + 1, temp);
	      }
	  }
      }
    for (int i = 0; i < arraylist.size (); i++)
      {
	sortedArray.add (arraylist.get (i));
      }
    System.out.println ("The median is: " +
			sortedArray.get (sortedArray.size () / 2));
//Mode =========================================
    int Mode = 0;
    for (int i = 0; i < sortedArray.size () - 1; i++)
      {
	if (sortedArray.get (i) == sortedArray.get (i + 1))
	  {
	    median = sortedArray.get (i);
	  }
      }
    System.out.println ("The mode is: " + median);
//Graph =========================================
    System.out.print ("1 - 5: ");
    for (int i = 0; i < sortedArray.size (); i++)
      {
	if (sortedArray.get (i) >= 1 && sortedArray.get (i) <= 5)
	  {
	    System.out.print ("*");
	  }
      }
    System.out.println ("");
    System.out.print ("6 - 10: ");
    for (int i = 0; i < sortedArray.size (); i++)
      {
	if (sortedArray.get (i) >= 6 && sortedArray.get (i) <= 10)
	  {
	    System.out.print ("*");
	  }
      }
    System.out.println ("");
    System.out.print ("11 - 14: ");
    for (int i = 0; i < sortedArray.size (); i++)
      {
	if (sortedArray.get (i) >= 11 && sortedArray.get (i) <= 14)
	  {
	    System.out.print ("*");
	  }
      }
    System.out.println ("");
    System.out.print ("16 - 20: ");
    for (int i = 0; i < sortedArray.size (); i++)
      {
	if (sortedArray.get (i) >= 16 && sortedArray.get (i) <= 20)
	  {
	    System.out.print ("*");
	  }
      }
      System.out.println("");
    System.out.print ("21 - 25: ");
    for (int i = 0; i < sortedArray.size (); i++)
      {
	if (sortedArray.get (i) >= 21 && sortedArray.get (i) <= 25)
	  {
	    System.out.print ("*");
	  }
      }
    System.out.println ("");
    System.out.print ("26 - 30: ");
    for (int i = 0; i < sortedArray.size (); i++)
      {
	if (sortedArray.get (i) >= 26 && sortedArray.get (i) <= 30)
	  {
	    System.out.print ("*");
	  }
      }
    System.out.println ("");
    System.out.print ("31 - 35: ");
    for (int i = 0; i < sortedArray.size (); i++)
      {
	if (sortedArray.get (i) >= 31 && sortedArray.get (i) <= 35)
	  {
	    System.out.print ("*");
	  }
      }
    System.out.println ("");
    System.out.print ("36 - 40: ");
    for (int i = 0; i < sortedArray.size (); i++)
      {
	if (sortedArray.get (i) >= 36 && sortedArray.get (i) <= 40)
	  {
	    System.out.print ("*");
	  }
      }
    System.out.println ("");
    System.out.print ("41 - 45: ");
    for (int i = 0; i < sortedArray.size (); i++)
      {
	if (sortedArray.get (i) >= 41 && sortedArray.get (i) <= 45)
	  {
	    System.out.print ("*");
	  }
      }
    System.out.println ("");
    System.out.print ("46 - 50: ");
    for (int i = 0; i < sortedArray.size (); i++)
      {
	if (sortedArray.get (i) >= 46 && sortedArray.get (i) <= 50)
	  {
	    System.out.print ("*");
	  }
      }
    System.out.println ("");
  }
}
