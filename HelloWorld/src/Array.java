import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		String studentnames[] = {"bryan", "charles", "mike"};
		int numbers [] = {1,2,3,4,5,6};
		
		studentnames[0] = "yanyan";
		System.out.println(studentnames[0]);
		
		Scanner s = new Scanner (System.in);
		System.out.print("Enter name: ");
		studentnames[0] = s.nextLine();
		
		System.out.println("your updated name is " +studentnames[0]);
		
	}

}
