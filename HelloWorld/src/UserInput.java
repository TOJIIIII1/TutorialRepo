
import java.util.Scanner;
public class UserInput {

	public static void main(String[] args) {
		
		int num1;
		int num2;

		Scanner number = new Scanner(System.in);
		
		System.out.print("Enter Num1: ");
		num1 = number.nextInt();
		
		System.out.print("Enter Num2: ");
		num2 = number.nextInt();
		
		int result = num1 + num2;
		System.out.println("The result is " + result);
	}

}
