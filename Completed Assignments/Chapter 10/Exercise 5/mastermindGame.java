import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class mastermindGame
{
  public static void playGame ()
  {
    ArrayList < Integer > board = new ArrayList < Integer > ();
    ArrayList < Integer > guesses = new ArrayList < Integer > ();
    ArrayList < Integer > check = new ArrayList < Integer > ();

    Scanner input = new Scanner (System.in);
    Random rand = new Random ();
    int size = rand.nextInt (10);
    int chances = 0;
    int pegs = 0;
    int colours = 0;
//===================================================
    for (int i = 0; i < size; i++)
      {
	board.add (rand.nextInt (9));
      }
//=================================================== Displays the code
/*    for (int i = 0; i < size; i++)
      {
	System.out.print (board.get (i) + ", ");
      }
    System.out.println (""); */
//===================================================
    while (pegs != board.size ())
      {
	pegs = 0;
	colours = 0;
	guesses = new ArrayList < Integer > ();
//===================================================
	for (int i = 0; i < size; i++)
	  {
	    System.out.println ("Enter guess for peg " + (i + 1) + ": ");
	    guesses.add (input.nextInt ());
	  }
//===================================================

	for (int i = 0; i < board.size (); i++)
	  {
	    if (guesses.get (i) == board.get (i))
	      {
		check.add (2);
		colours++;
		pegs++;
	      }
	    if (guesses.get (i) != board.get (i)
		&& board.contains (guesses.get (i)))
	      {
		check.add (1);
		colours++;
	      }
	    else
	      {
		check.add (0);
	      }
	  }
	System.out.println ("You have " + pegs + " peg(s) and " + colours +
			    " colours correct.");
//==================================================
	chances++;
      }
    System.out.println ("You broke the code in: " + chances + " chances!");
  }
}
