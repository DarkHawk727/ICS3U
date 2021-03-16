import java.util.Scanner;
public class Main
{

  public static void main (String[]args)
  {
    Scanner input = new Scanner (System.in);
    DigitExtractor extract = new DigitExtractor ();
      System.out.println ("Please enter a 3 digit number: ");
    int num = input.nextInt ();
    String choice = "";
    while (choice.equals ("Q") == false)
      {
	choice = input.nextLine ();
	if (choice.equals ("W"))
	  {
	    System.out.println ("The whole number is: " + num);
	  }
	if (choice.equals ("H"))
	  {
	    System.out.println ("The hundreds place of " + num + " is: " +
				extract.showHundreds (num));
	  }
	if (choice.equals ("T"))
	  {
	    System.out.println ("The tens place of " + num + " is: " +
				extract.showTens (num));
	  }
	if (choice.equals ("O"))
	  {
	    System.out.println ("The ones place of " + num + " is: " +
				extract.showOnes (num));
	  }
	System.out.println ("Show the (W)hole number");
	System.out.println ("Show the (H)undreds digit");
	System.out.println ("Show the (T)ens digit");
	System.out.println ("Show the (O)nes digit");
	System.out.println ("(Q)uit");
      }

  }
}
