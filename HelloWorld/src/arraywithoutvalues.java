import java.util.Scanner;
public class arraywithoutvalues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String studentnames[] = new String[20];
		int studentnumbers[] = new int[20];
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter first array ");
		studentnames[0] = s.nextLine();
		System.out.println("The first array is " +studentnames[0]);
		
		System.out.print("Enter second array ");
		studentnames[1] = s.nextLine();
		System.out.println("The second array is " +studentnames[1]);
		
		System.out.print("Enter second array ");
		studentnames[21] = s.nextLine();
		System.out.println("The second array is " +studentnames[21]);
		
		System.out.print("first array: " +studentnames[0] + " second array : " +studentnames[1]+ studentnames[21]);
	}

}
