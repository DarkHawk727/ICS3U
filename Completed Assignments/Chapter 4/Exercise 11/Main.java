import java.util.Scanner;
import java.text.NumberFormat;
public class NewMain
{
  public static void main (String[]args)
  {
    Scanner input = new Scanner (System.in);
    NumberFormat formatter = NumberFormat.getCurrencyInstance ();
      System.out.println ("Please enter number of burgers: ");
    int burgers = input.nextInt ();
      System.out.println ("Please enter number of fries: ");
    int fries = input.nextInt ();
      System.out.println ("Please enter number of sodas: ");
    int sodas = input.nextInt ();
    float beforeTax = (1.69f * burgers) + (1.09f * fries) + (0.99f * sodas);
      String beforeTax1 = formatter.format (beforeTax);
      System.out.println ("The total before tax is: " + beforeTax1);
    float afterTax = beforeTax * 1.065f;
    float tax = afterTax - beforeTax;
    String tax1 = formatter.format(tax);
    System.out.println("Your tax will be: " + tax1);
    String total = formatter.format(afterTax); 
    System.out.println("Your total will be: " + total);
  }
}
