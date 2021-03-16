import java.util.Scanner;
import java.util.Random;
public class Adder
{
  int num1;
  int num2;
  int ans;
  int chance = 1;
  int guess;
  int score = 0;

  public int gameLoop ()
  {
    Scanner input = new Scanner (System.in);
    Random rand = new Random ();
    while (guess != 999)
      {
	if (chance == 1)
	  {
	    num1 = rand.nextInt (21);
	    num2 = rand.nextInt (21);
	    ans = num1 + num2;
	  }
	System.out.println ("What is " + num1 + " + " + num2 + " = ?");
	guess = input.nextInt ();
	if (guess == ans && chance == 1)
	  {
	    System.out.println ("Correct! You earned 5 points!");
	    score += 5;
	    chance = 1;
	  }
	if (guess == ans && chance == 2)
	  {
	    System.out.println ("Correct! You earned 3 points!");
	    score += 3;
	    chance = 1;
	  }
	if (guess == ans && chance == 3)
	  {
	    System.out.println ("Correct! You earned 1 point!");
	    score += 1;
	    chance = 1;
	  }
	if (guess != ans)
	  {

	    System.out.println ("Incorrect! Please try again: ");
	    chance++;
	  }
	if (chance > 3)
	  {
	    System.out.println ("Your score was: " + score);
	    break;

	  }
      }
    return score;
  }
}
