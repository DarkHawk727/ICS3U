import java.util.Random;
public class Main
{
  public static void main (String[]args)
  {
    Random r = new Random ();
    int dice1 = r.nextInt (6);
    int dice2 = r.nextInt (6);
    int sum = 0;
      System.out.format ("%5s %5s %3s", "Dice1", "Dice2", "Sum");
      System.out.println ("");
    for (int i = 0; i < 5; i++)
      {
	dice1 = r.nextInt (6);
	dice2 = r.nextInt (6);
	sum = dice1 + dice2;
	System.out.format ("%5s %5s %3s", dice1, dice2, sum);
	System.out.println ("");
      }
  }
}
