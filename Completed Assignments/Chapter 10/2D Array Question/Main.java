import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
 
TTT game = new TTT();
game.initializeBoard();
game.displayBoard();
while(!game.boardFull()){
    game.placeMark();
}

  }
}
