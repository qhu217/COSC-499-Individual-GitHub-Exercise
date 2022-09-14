import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class master_branch {
	
	
	public static void main(String[] args) {
		// main function: ask for user to enter a list of numbers or characters
		Scanner sc = new Scanner(System.in);
		System.out.print("Do you want to enter integers or characters? Please enter 'i' for integers and 'c' for characters: ");
		char c = sc.next().charAt(0);
		while ((c=='c')==false && (c=='i')==false && (c=='C')==false && (c=='I')==false) {
			System.out.print("Invalid input! Please enter 'i' for integers and 'c' for characters: ");
			c = sc.next().charAt(0);
		}
		if (c == 'i' || c == 'I')
			System.out.println("You're going to enter a list of integers!");
		else if (c == 'c' || c == 'C')
			System.out.println("You're going to enter a list of characters!");

		System.out.print("Please enter the amount of integers or characters: ");
		while (!sc.hasNextInt()) {
			System.out.print("You need to enter an integer. Please enter the amount of integers or characters: ");
			sc.next();
		}
		int amount = sc.nextInt();
		
		
		
	}

}
