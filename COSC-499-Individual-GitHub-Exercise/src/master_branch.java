import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class master_branch {
	
	
	public static void main(String[] args) {
		// main function: ask for user to enter a list of numbers or characters
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the amount of integers or characters: ");
		try {
			int amount = sc.nextInt();
		}
		catch (Exception ex) {
			System.out.println("You need to enter an integer.");
		}
		
		
	}

}
