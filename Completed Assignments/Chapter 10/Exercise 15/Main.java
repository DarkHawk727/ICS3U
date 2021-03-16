import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    mankala mankala = new mankala ();
    Scanner input = new Scanner (System.in);
    int[] board = new int[14];
      board[0] = 3;
      board[1] = 3;
      board[2] = 3;
      board[3] = 3;
      board[4] = 3;
      board[5] = 3;
      board[6] = 0;
      board[7] = 3;
      board[8] = 3;
      board[9] = 3;
      board[10] = 3;
      board[11] = 3;
      board[12] = 3;
      board[13] = 0;
    boolean done = false;
    int spot = 0;
    int turn = 1;
      mankala.display (board);
    while (!done)
      {
	if (turn == 1)
	  {
	    if (mankala.canPlayPlayer1 (board) == true)
	      {
		System.out.println ("Player 1 (A - F): ");
		spot = input.next ().charAt (0) - 65;
		turn = mankala.distributeStones (board, spot, turn);
		mankala.display (board);
	      }
	    else
	      {
		done = true;
	      }
	  }
	if (turn == 2)
	  {
	    if (mankala.canPlayPlayer2 (board) == true)
	      {
		System.out.println ("Player 2 (A - F): ");
		spot = input.next ().charAt (0) - 58;
		turn = mankala.distributeStones (board, spot, turn);
		mankala.display (board);
	      }
	    else
	      {
		done = true;
	      }
	  }
      }
  }
}
