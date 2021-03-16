public class DigitExtractor
{
  public static int showHundreds (int num)
  {
    int hundreds = 0;
      hundreds = num / 100;
      return hundreds;

  }

  public static int showTens (int num)
  {
    int tens = 0;
    tens = (num % 100) / 10;
    return tens;
  }

  public static int showOnes (int num)
  {
    int ones = 0;
    ones = ((num % 100) % 10) / 1;
    return ones;
  }
}
