public class Main
{
  public static void main (String[]args)
  {
    double principal = 2500;
    int years = 0;
    double interest = 0.075;
    double ending = 5000;
    double amount = 0.0;
    while (principal < ending)
      {

	principal *= 1.0d + interest;
	years++;
      }
    System.out.println ("It will take " + years + " years.");
  }
}
