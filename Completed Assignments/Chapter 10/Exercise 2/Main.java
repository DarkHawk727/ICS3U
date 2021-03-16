 import java.util.ArrayList;
public class Main
{
  public static void main (String[]args)
  {
    int array[] = new int[101];
      System.out.format ("%s %10s", "Index", "Number\n");
    for (int i = 0; i < array.length; i++)
      {
	array[i] = i + (i % 10) + ((int) i / 10);
	System.out.format ("%s %5s", i, array[i], "\n");
	System.out.println ("");
      }
  }
}
