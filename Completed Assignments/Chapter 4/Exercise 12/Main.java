import java.util.Scanner;
import java.text.NumberFormat;
public class Main
{
  public static void main (String[]args)
  {
    Scanner input = new Scanner (System.in);
    NumberFormat formatter = NumberFormat.getPercentInstance ();
      formatter.setMinimumFractionDigits (2);
      System.out.println
      ("Enter number of minutes spent on each of the following tasks: ");
    int designing = 120;
      System.out.println ("Designing: ");
      //designing = input.nextInt ();
    int coding = 240;
      System.out.println ("Coding: ");
      //coding = input.nextInt ();
    int debugging = 30;
      System.out.println ("Debugging: ");
      //debugging = input.nextInt ();
    int testing = 30;
      System.out.println ("Testing: ");
      //testing = input.nextInt ();
    int total = designing + coding + debugging + testing;
    float percent1 = (designing / total);
    float percent2 = (coding / total);
    float percent3 = (debugging / total);
    float percent4 = (testing / total);
    System.out.println(total);
    System.out.println(designing);
    System.out.println(coding);
    System.out.println(debugging);
    System.out.println(testing);
    System.out.println(percent1);
    System.out.println(percent2);
    System.out.println(percent3);
    System.out.println(percent4);

      /* System.out.format("%1s %20s", "Task", "Percent\n");
       System.out.format("%1s %10s", "Designing: ", formatter.format(percent1));
       System.out.format("%1s %10s", "Coding: ", formatter.format(percent2));
       System.out.format("%1s %10s", "Debugging: ", formatter.format(percent3));
       System.out.format("%1s %10s", "Testing: ", formatter.format(percent4));
       */
    }
}
