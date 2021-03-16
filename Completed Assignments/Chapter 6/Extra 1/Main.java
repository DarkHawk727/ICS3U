import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner input = new Scanner (System.in);
      System.out.println ("Please enter a string: ");
    String str = input.nextLine ();
//==========================================================================
      System.out.println ("a) The length of the string is: " + str.length ());
//==========================================================================
    int count = 0;
    char ch[] = new char[str.length ()];
    for (int i = 0; i < str.length (); i++)
      {
	ch[i] = str.charAt (i);
	if (((i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' '))
	    || ((ch[0] != ' ') && (i == 0)))
	  {
	    count++;
	  }
      }
    System.out.println ("b) The number of words in the string is: " + count);
//==========================================================================
    String reverse = "";
    for (int i = str.length () - 1; i >= 0; i--)
      {
	reverse += str.charAt (i);
      }
    System.out.println ("c) The reversed string is: " + reverse);
//==========================================================================
    String uppercase = str;
    System.out.println ("d) The string in uppercase is: " +
			uppercase.toUpperCase ());
//==========================================================================
    String lowercase = str;
    System.out.println ("e) The string in lowercase is: " +
			lowercase.toLowerCase ());
//==========================================================================
    count = 0;
    for (int i = 0; i < str.length (); i++)
      {
	if (str.charAt (i) == 'a' || str.charAt (i) == 'e'
	    || str.charAt (i) == 'i' || str.charAt (i) == 'o'
	    || str.charAt (i) == 'u' || str.charAt (i) == 'y'
	    || str.charAt (i) == 'A' || str.charAt (i) == 'E'
	    || str.charAt (i) == 'I' || str.charAt (i) == 'O'
	    || str.charAt (i) == 'U' || str.charAt (i) == 'Y')
	  {
	    count++;
	  }
      }
    System.out.println ("f) The number of vowels is: " + count);
//==========================================================================
    count = 0;
    for (int i = 0; i < str.length (); i++)
      {
	if (str.charAt (i) == 'b' || str.charAt (i) == 'c'
	    || str.charAt (i) == 'd' || str.charAt (i) == 'f'
	    || str.charAt (i) == 'g' || str.charAt (i) == 'h'
	    || str.charAt (i) == 'j' || str.charAt (i) == 'k'
	    || str.charAt (i) == 'l' || str.charAt (i) == 'm'
	    || str.charAt (i) == 'n' || str.charAt (i) == 'p'
	    || str.charAt (i) == 'q' || str.charAt (i) == 'r'
	    || str.charAt (i) == 's' || str.charAt (i) == 't'
	    || str.charAt (i) == 'v' || str.charAt (i) == 'w'
	    || str.charAt (i) == 'y' || str.charAt (i) == 'z'
	    || str.charAt (i) == 'B' || str.charAt (i) == 'C'
	    || str.charAt (i) == 'D' || str.charAt (i) == 'F'
	    || str.charAt (i) == 'G' || str.charAt (i) == 'H'
	    || str.charAt (i) == 'J' || str.charAt (i) == 'K'
	    || str.charAt (i) == 'L' || str.charAt (i) == 'M'
	    || str.charAt (i) == 'N' || str.charAt (i) == 'P'
	    || str.charAt (i) == 'Q' || str.charAt (i) == 'R'
	    || str.charAt (i) == 'S' || str.charAt (i) == 'T'
	    || str.charAt (i) == 'V' || str.charAt (i) == 'W'
	    || str.charAt (i) == 'Y' || str.charAt (i) == 'Z')
	  {
	    count++;
	  }
      }
    System.out.println ("g) The number of consonants is: " + count);
//==========================================================================
    int space = str.indexOf (' ');
    int ascii = 0;
    String firstWord = str.substring (0, space);
    System.out.print ("h) The ascii version of the first word is: ");
    for (int i = 0; i < firstWord.length (); i++)
      {
	ascii = firstWord.charAt (i);

	System.out.print (ascii + " ");
      }
    System.out.println ();
//==========================================================================
    if (str.indexOf ("and") == -1)
      {
	System.out.println ("i) The string does NOT contain 'and'");
      }
    else
      {
	System.out.println ("i) The string does contain 'and'");
      }
//==========================================================================
    boolean consecutive = false;
    count = 0;
    for (int i = 1; i < str.length (); i++)
      {
	if ((str.charAt (i) == 'a' || str.charAt (i) == 'e'
	     || str.charAt (i) == 'i' || str.charAt (i) == 'o'
	     || str.charAt (i) == 'u' || str.charAt (i) == 'y'
	     || str.charAt (i) == 'A' || str.charAt (i) == 'E'
	     || str.charAt (i) == 'I' || str.charAt (i) == 'O'
	     || str.charAt (i) == 'U' || str.charAt (i) == 'Y')
	    && (str.charAt (i) == str.charAt (i - 1)))
	  {
	    consecutive = true;
	    if (consecutive == true)
	      {
		System.out.println ("j) The vowel " + str.charAt (i) +
				    " occurs conscutivley");
	      }
	  }
      }

    if (consecutive == false)
      {
	System.out.println ("j) No vowels occur consecutivley");
      }
//==========================================================================
    count = 0;
    for (int i = 0; i < str.length (); i++)
      {
	if (Character.isUpperCase (str.charAt (i)))
	  {
	    count++;
	  }
      }
    System.out.
      println ("k) The number of uppercase leters in the string is: " +
	       count);
//==========================================================================
    count = 0;
    for (int i = 0; i < str.length (); i++)
      {
	if (Character.isLowerCase (str.charAt (i)))
	  {
	    count++;
	  }
      }
    System.out.
      println ("l) The number of lowercase leters in the string is: " +
	       count);
//==========================================================================
    count = 0;
    for (int i = 0; i < str.length (); i++)
      {
	if (!Character.isLetter (str.charAt (i)) && str.charAt (i) != ' ')
	  {
	    count++;
	  }
      }
    System.
      out.println ("m) The number of punctuation marks in the string is: " +
		   count);
//==========================================================================

  }

}
