import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class master_branch {
	//feature 1: sort a list of integers
	public static String sort_integers(int amount, Scanner sc) {
		ArrayList<Integer> list = new ArrayList<>(amount);
		for (int i = 0; i < amount; i++) {
			System.out.print("Please enter an integer: ");
			while (!sc.hasNextInt()) {
				System.out.print("Invalid input. Please enter an integer: ");
				sc.next();
			}
			list.add(sc.nextInt());
		}
		Collections.sort(list);
		System.out.print("The sorted list of integers is: ");
		for (int i: list)
			System.out.print(i + " ");
		String s = "";
		for (int i: list) {
			s += i;
			s += " ";
		}
		return s;
	}
	//feature 2: sort a list of characters
	public static String sort_chars(int amount, Scanner sc) {
		ArrayList<Character> list = new ArrayList<>(amount);
		for (int i = 0; i < amount; i++) {
			System.out.print("Please enter a character: ");
			String s = sc.next();
			while (!Character.isLetter(s.charAt(0))) {
				System.out.print("Invalid input. Please enter a character: ");
				s = sc.next();
			}
			list.add(s.charAt(0));
		}
		Collections.sort(list);
		System.out.print("The sorted list of characters is: ");
		for (char i: list)
			System.out.print(i + " ");
		String s = "";
		for (char i: list) {
			s += i;
			s += " ";
		}
		return s;
	}
		
	public static void main(String[] args) {
		// main function: ask for user to enter a list of numbers or characters
		Scanner sc = new Scanner(System.in);
		// feature 1: a list of integers
		boolean f1 = false;
		// feature 2: a list of characters
		boolean f2 = false;

		System.out.print("Do you want to enter integers or characters? Please enter 'i' for integers and 'c' for characters: ");
		char c = sc.next().charAt(0);
		while ((c=='c')==false && (c=='i')==false && (c=='C')==false && (c=='I')==false) {
			System.out.print("Invalid input! Please enter 'i' for integers and 'c' for characters: ");
			c = sc.next().charAt(0);
		}
		if (c == 'i' || c == 'I') {
			System.out.println("You're going to enter a list of integers!");
			f1 = true;
		}
		else if (c == 'c' || c == 'C') {
			System.out.println("You're going to enter a list of characters!");
			f2 = true;
		}
		System.out.print("Please enter the amount of integers or characters: ");
		while (!sc.hasNextInt()) {
			System.out.print("You need to enter an integer. Please enter the amount of integers or characters: ");
			sc.next();
		}
		int amount = sc.nextInt();
		
		//feature 1: sort a list of integers entered by user
		if (f1) {
		  sort_integers(amount, sc);
		}
		//feature 2: sort a list of characters entered by user

		else {
			sort_chars(amount, sc);
		}
		
		sc.close();
	}

}
