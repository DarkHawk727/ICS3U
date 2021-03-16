import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your percentage: ");
		int grade = input.nextInt();
		if(grade>= 90){
		    System.out.println("Your grade is: A");
		}
		if( grade >= 80 && grade <= 89){
		    System.out.println("Your grade is: B");
		}
		if( grade >= 70 && grade <= 79){
		    System.out.println("Your grade is: C");
		}
		if( grade >= 60 && grade <= 69){
		    System.out.println("Your grade is: D");
		}
		if(  grade < 60){
		    System.out.println("Your grade is: F");
		}
	}
}
