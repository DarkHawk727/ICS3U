import java.util.Scanner;
public class mankala
{
  public static void display (int board[])
  {
    System.out.format ("\t %-1s %4s %4s %4s %4s %4s\n", "[12]", "[11]",
		       "[10]", "[9]", "[8]", "[7]");
    System.out.format ("\t   %-1s %4s %4s %4s %4s %4s\n", board[12],
		       board[11], board[10], board[9], board[8], board[7]);
    System.out.format ("%-35s %1s\n", "[13]" + board[13], "[6]" + board[6]);
    System.out.format ("\t   %-1s %4s %4s %4s %4s %4s\n", board[0], board[1],
		       board[2], board[3], board[4], board[5]);
    System.out.format ("\t  %-1s %4s %4s %4s %4s %4s\n", "[0]", "[1]", "[2]",
		       "[3]", "[4]", "[5]");
    System.out.format ("\t  %-1s %4s %4s %4s %4s %4s\n", "[A]", "[B]", "[C]",
		       "[D]", "[E]", "[F]");
  }
  public static boolean canPlayPlayer1 (int board[])
  {
    boolean play = false;
    for (int c = 0; c < 6; c++)
      {
	if (board[c] != 0)
	  play = true;
      }
    return play;
  }
  public static boolean canPlayPlayer2 (int board[])
  {
    boolean play = false;
    for (int c = 7; c < 13; c++)
      {
	if (board[c] != 0)
	  play = true;
      }
    return play;
  }
  public static int distributeStones (int board[], int spot, int turn)
  {
    int stones = board[spot];
    board[spot] = 0;
    if(turn == 2){
        spot += 7;
        turn = 1;
    }
    for (int c = 0; c < stones; c++)
      {
	spot++;
	if (spot >=  12)
	  spot = 0;
	board[spot]++;
      }
    if (spot != 6)
      {
	turn = 2;
      }
    if (board[spot] == 1 && (spot >= 0 && spot <= 5))
      {
	board[7] += board[13 - spot];
      }
    return turn;
  }

}
